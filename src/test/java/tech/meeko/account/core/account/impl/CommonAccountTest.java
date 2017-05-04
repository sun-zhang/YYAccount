package tech.meeko.account.core.account.impl;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import tech.meeko.account.core.account.CommonAccount;
import tech.meeko.account.core.base.Account;

import java.util.concurrent.*;

/**
 * CommonAccount Tester.
 *
 * @author Sam
 * @version 1.0
 * @since <pre>May 3, 2017</pre>
 */
public class CommonAccountTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getBalance()
     */
    @Test
    public void testGetBalance() throws Exception {
        CommonAccount account = new CommonAccount(new Account());
        assert account.getBalance().longValue() == 0L;
    }

    /**
     * Method: increaseBalance(Long amount)
     */
    @Test
    public void testIncreaseBalance() throws Exception {
        CommonAccount account = new CommonAccount(new Account());
        account.increaseBalance(1L);
        assert account.getBalance().longValue() == 1;
    }

    /**
     * Method: reduceBalance(Long amount)
     */
    @Test
    public void testReduceBalance() throws Exception {
        CommonAccount account = new CommonAccount(new Account());
        account.increaseBalance(2L);
        account.reduceBalance(1L);
        assert account.getBalance().longValue() == 1;
    }

    @Test
    public void testGetBalanceConcurrent() throws Exception{
        for (int i=0; i<10; i++)
            threadRunning(2,1);
    }

    @Test
    public void testGetBalanceConcurrentBigNumber() throws Exception{
        for (int i=0; i<10; i++)
            threadRunning(2,1000000000);
    }

    private void threadRunning(final int threadNum, final int increaseNum) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final CommonAccount account = new CommonAccount(new Account());
        final CountDownLatch countDown = new CountDownLatch(threadNum);
        for (int i=0; i<threadNum; i++){
            Runnable run = new Runnable() {
                public void run() {
                    for (int j=0; j<(10000000/threadNum);j++){
                        account.increaseBalance(new Long(increaseNum));
                    }
                    countDown.countDown();
                }
            };
            executorService.execute(run);
        }
        countDown.await();
        System.out.println("最终余额："+ account.getBalance()+"  "+account.getAvailableBalance());
        executorService.shutdown();
    }

} 
