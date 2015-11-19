package mum.edu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

import mum.edu.logging.ILogger;
import mum.edu.logging.Logger;

@Aspect
public class loggingAspect {
	
	private ILogger logger=new Logger();
	
	@Around("execution(* mum.edu.service.*.get*(..))")
	public Object invoke(ProceedingJoinPoint call ) throws Throwable {
		 
		StopWatch sw = new StopWatch();
		 sw.start(call.getSignature().getName());
		 Object retVal = call.proceed();
		 sw.stop();

		long totaltime = sw.getLastTaskTimeMillis();
		logger.log("Time to execute method "+call.getSignature().getName()  +" is "+totaltime);

		return retVal;
		}
}
