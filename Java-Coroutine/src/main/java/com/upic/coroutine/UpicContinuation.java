package com.upic.coroutine;
/**
 * 
 * @author DTZ
 *
 * @param <T>
 */
public interface UpicContinuation {
public UpicContinuationContext getContext(); 	
//�ص�����
public void resume(Object t);
//�����쳣ʱ���õķ���
public void resumeWithException(Throwable exception);
}
