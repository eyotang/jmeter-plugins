/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kg.apc.jmeter.perfmon;

import kg.apc.jmeter.perfmon.agent.AgentSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author APC
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({PerformanceMonitoringTestElementTest.class, TCPSocketFactoryTest.class, ServerPerfMonitoringGUITest.class, AgentConnectorTest.class, AbstractPerformanceMonitoringGuiTest.class, MetricsProvider.class, AgentSuite.class})
public class PerfmonSuite {

   @BeforeClass
   public static void setUpClass() throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

   @Before
   public void setUp() throws Exception
   {
   }

   @After
   public void tearDown() throws Exception
   {
   }

}