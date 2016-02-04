package org.camunda.bpm.engine.test.assertions.helpers;

import org.camunda.bpm.engine.runtime.CaseExecution;
import org.camunda.bpm.engine.runtime.CaseExecutionQuery;
import org.camunda.bpm.engine.runtime.CaseInstance;
import org.mockito.Matchers;

/**
 * @author Malte Sörensen <malte.soerensen@holisticon.de>
 */
public class CamundaMatchers extends Matchers {

  public static CaseInstance anyCaseInstance() {
    return any(CaseInstance.class);
  }

  public static CaseExecution anyCaseExecution() {
    return any(CaseExecution.class);
  }

  public static CaseExecutionQuery anyCaseExecutionQuery() {
    return any(CaseExecutionQuery.class);
  }
}
