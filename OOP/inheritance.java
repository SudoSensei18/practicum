package whretg;

public class inheritance {

	public static void main(String[] args) {
		
		bic bbb= new bic(50,12);
		System.out.println(bbb.INFOR());
		mbic mb = new mbic(50,12,4);
		mb.Rwheel(15);
		System.out.println(mb.mINFOR());

	}

}
class bic{
	int speed, gear;
	bic(int speed, int gear){
		this.speed=speed;
		this.gear=gear;
	}
	int applybreake(int dec) {
		speed=speed-dec;
		return speed;
	}
	int speedUP(int inc) {
		speed+=inc;
		return speed;
		
	}
	String INFOR() {
		return "This bike has:"+gear+"gears, and speed is about:"+speed;
		
	}
}

class mbic extends bic{
		int wheelSize;
		mbic(int speed,int gear, int wheelSize){
			super(speed, gear);
			this.wheelSize=wheelSize;
		}
		int Rwheel() {
			speed = speed+1/4*wheelSize;
		
			return speed;
		}
	String mINFOR() {
		
		return super.INFOR()+"After replacing of the wheel, speed is:"+Rwheel();
	}
}