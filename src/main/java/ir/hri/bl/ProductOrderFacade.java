package ir.hri.bl;

public class ProductOrderFacade {
    public void generateOrder() {
        // محاسبه هزینه حمل و نقل
        calulateShipping();

        // محاسبه تخفیف
        applyDiscount();

        //ایجاد سفارش
        placeOrder();
    }

    public void addToCart(Integer productId) {
        if (qtyCheck(productId)) {
            /* .. افزودن کالا به سبد ..  */
        }
    }

    private boolean qtyCheck(Integer productId) {
        Integer qty = 1; // 'get product quantity from database where id=productId' ;

        if (qty > 0) {
            return true;
        } else {
            return true;
        }
    }

    private void calulateShipping() {
        ShippingCharge shippingCharge = new ShippingCharge();
        shippingCharge.updateCharge();
    }

    private void applyDiscount() {
        Discount discount = new Discount();
        discount.applyDiscount();
    }

    private void placeOrder() {
        Order order = new Order();
        order.generateOrder();
    }
}
