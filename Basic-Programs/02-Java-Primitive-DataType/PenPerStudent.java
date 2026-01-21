class PenPerStudent{
    public static void main(String[] args){
	    int student=3;
		int pen=14;
		int remainder=pen % student;
		int quantity = pen / student;
		System.out.println("The Pen Per Student is "+quantity+" and the remaining pen not distributed is "+remainder);
	}
}