 // By the use of satter

// Inventory & payment ---> order.xml ---> testorder1

package com.rays.ioc;
public class Order1 {
/*Instance Variables:
	payment: Payment process karne ke liye dependency.
	inventory: Stock manage karne ke liye dependency.
*/
	    private Payment payment;
	    private Inventory inventory;
	    
	// Setter injection
	public void setPayment(Payment payment) {
		this.payment = payment;//this.payment me payment object assign kiya jata hai.
	}

	// Setter injection
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;//inventory me inventory object assign kiya jata hai.
	}

	public void bookATicket(int items) {//bookATicket method ek order (ticket booking) process karta hai.
//										items parameter ke zariye order me kitni items chahiye wo pass hota hai

		int price = 10;//Ek item ka price 10 set kiya gaya hai.


		double totalAmount = items * price;//Items ka total price calculate kar raha hai (items * price)

		double updatedBalance = payment.makePayment(totalAmount);//makePayment method call hota hai jo total amount ka payment karta hai.
		                                                            // Updated balance return karta hai.


		
		
		
		int updatedStock = inventory.sold(items);//sold method ko call karke stock reduce kiya jata hai.
		                                             //Updated stock return karta hai.


		System.out.println("Tickets are Booked");
		System.out.println("Total Amount Paid: " + totalAmount);
		System.out.println("Remaining Balance: " + updatedBalance);
		System.out.println("Updated Stock: " + updatedStock);
	}

}























