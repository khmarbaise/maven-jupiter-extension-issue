package org.apache.maven.jupiter.extension;

import java.io.IOException;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * @author Karl Heinz Marbaise
 */
public class MavenITExtension implements BeforeEachCallback, BeforeTestExecutionCallback {

  @Override
  public void beforeEach(ExtensionContext context) {
    System.out.println("MavenITExtension: beforeEach()");
    System.out.println(
        "MavenITExtension: beforeEach() context.getTestMethod() = " + context.getTestMethod().get().getName());
  }

  @Override
  public void beforeTestExecution(ExtensionContext context) throws IOException, InterruptedException {
    System.out.println(
        "MavenITExtension: beforeTestExecution: context.getTestMethod() = " + context.getTestMethod().get().getName());
  }

}
