package com.example.testing;

import com.example.testing.product.CurrencyConvertor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class TestingApplicationTests {

	@MockBean
	CurrencyConvertor currencyConvertor;

	@Test
	void contextLoads() {
	}

}
