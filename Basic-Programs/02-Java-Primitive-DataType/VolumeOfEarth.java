class VolumeOfEarth{
    public static void main(String[] args){
	    double a=Math.PI;
		double radius = 6378;
		double volume= (4/3)*a*radius*radius*radius;
		double miles=radius*0.621371;
		System.out.println("The volume of earth in cubic kilometer is " +volume+" and cubic miles is "+miles);
	}
}