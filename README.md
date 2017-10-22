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
