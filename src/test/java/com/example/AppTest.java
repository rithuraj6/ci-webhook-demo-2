package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {


@Test
void testMultiply() {
	App app = new app();
	assertEquals(6,app.multiply(2,3));
}
}

