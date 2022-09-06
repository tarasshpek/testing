package com.example.testing.product;

import com.example.testing.calculator.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private CurrencyConvertor currencyConvertor;

    public ProductServiceImpl(CurrencyConvertor currencyConvertor) {
        this.currencyConvertor = currencyConvertor;
    }

    @Override
    public int getPriceInCurrency(Product product, String currency) {
        if (currency.equals(product.getCurrency())) {
            return product.getPrice();
        }
        return currencyConvertor.convert(product.getCurrency(), currency, product.getPrice());
    }

    public void throwsException() {
        throw new ProductException();
    }
}
