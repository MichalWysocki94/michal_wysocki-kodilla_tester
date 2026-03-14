package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @BeforeEach
    public void initializeInvoice(){
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach
    public void resetValues(){
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage(){
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage(){
        System.out.println("Finishing testing");
    }






    @Test
    public void shouldAddItemsToInvoice() {
        //When
        int numberOfItems = invoice.getSize();

        //Then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        //When
        Item result = invoice.getItem(2);

        //Then
        assertEquals("Bread", result.getName());
        assertEquals(4.15, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //When
        Item result = invoice.getItem(-3);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //When
        Item result = invoice.getItem(7);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //When
        invoice.clear();

        //Then
        assertEquals(0, invoice.getSize());
    }














//    Invoice invoice = new Invoice();
//    Item apple = new Item("apple",1.99);
//    Item orange = new Item("orange",1.29);
//    Item cookies = new Item("cookies",6.59);
//    Item water = new Item("water",1.09);
//    Item cheese = new Item("cheese",3.99);
//
//    @Test
//    public void testAddItem(){
//        //given
//
//        //when
//        invoice.addItem(cookies);
//        //then
//        assertEquals(1, invoice.getSize());
//        assertEquals("cookies", invoice.getItem(0).getName());
//    }
//
//    @Test
//    public void testAddMoreItems(){
//        //given
//        invoice.addItem(cookies);
//        invoice.addItem(water);
//        Item expected = new Item("apple", 1.99);
//        //when
//        invoice.addItem(apple);
//        //then
//        assertEquals(3, invoice.getSize());
//        assertEquals(expected, invoice.getItem(2));
//    }
//
//    @Test
//    public void testGetItemNull(){
//        //given
//        invoice.addItem(cookies);
//        invoice.addItem(water);
//        //when
//        Item result = invoice.getItem(-2);
//        //then
//        assertEquals(null, result);
//
//    }
//
//    @Test
//    public void testGetItemHighNumberOverIndex(){
//        //given
//        invoice.addItem(orange);
//        invoice.addItem(cheese);
//        //when
//        Item result = invoice.getItem(124);
//        //then
//        assertEquals(null, result);
//    }
//
//    @Test
//    public void testClearingInvoive(){
//        //given
//        invoice.addItem(orange);
//        invoice.addItem(cheese);
//        Invoice expected = new Invoice();
//        //when
//        invoice.clear();
//        //then
//        assertEquals(expected, invoice);
//    }

}