package part5.objects_and_references.card_payments;

public class PaymentTerminal {
    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public static final double AFFORDABLE_PRICE = 2.5;
    public static final double HEARTY_PRICE = 4.3;

    public PaymentTerminal(){
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment){
        if(payment < AFFORDABLE_PRICE){
            return payment;
        }else{
            this.affordableMeals += 1;
            this.money += AFFORDABLE_PRICE;
            return payment - AFFORDABLE_PRICE;
        }
    }

    public double eatHeartily(double payment){
        if(payment < HEARTY_PRICE){
            return payment;
        }else{
            this.heartyMeals +=1;
            this.money += HEARTY_PRICE;
            return payment-HEARTY_PRICE;
        }
    }

    public boolean eatAffordably(PaymentCard card){
        if(card.balance() < AFFORDABLE_PRICE){
            return false;
        }
        this.affordableMeals += 1;
        return card.takeMoney(AFFORDABLE_PRICE);
    }

    public boolean eatHeartily(PaymentCard card){
        if(card.balance() < HEARTY_PRICE){
            return false;
        }
        this.heartyMeals += 1;
         return  card.takeMoney(HEARTY_PRICE);
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
