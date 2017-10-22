# JUnit
Repositories Cover usage of JUnit

## JUnit Basic Annotations
1. @Test
2. @Before
3. @After
4. @BeforeClass
5. @AfterClass
6. @Ignore
7. @Test(expected = Exception.class)
8. @Test(timeout = 100)

The assert methods are under namespace org.junit.Assert package.

assertEquals("expected", "actual") will be used to check the equality of the the result

assertEquals also privode an overloaded method which provides optional messsage in case of failue
assertEquals("message", "expected", "actual")

@Ignore will ignore the tests marked with the attribute.

@BeforeClass 
Executes before once for the test class

@AfterClass
Executes once after the tests are run for the class

@Test(timeout=100)
number of milliseconds the test wait for the method to be executed and report failure if the test is not completed in the timeframe.

