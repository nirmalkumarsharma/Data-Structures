package org.leetcode.array;

public class MinimumTime {

	public static void main(String[] args) {
		int[][] points = new int[][] {{1,1},{3,4},{-1,0}};
		int lastX = points[0][0];
        int lastY = points[0][1];
        int time = 0;
        for(int i = 1; i < points.length; i++){
            time += calCulate(lastX, lastY, points[i][0], points[i][1]);
            lastX = points[i][0];
            lastY = points[i][1];
        }
        System.out.println(time);
	}
	private static int calCulate(int x1, int y1, int x2, int y2){
        int xStep = (x2>=x1)?1:-1;
        int yStep = (y2>=y1)?1:-1;
        int time = 0;
        int x = x1;
        int y = y1;
        while(true){
        	
            if(x==x2 && y==y2){
                break;
            }
            System.out.println(x+","+y);
            if(x!=x2 || y!=y2){
                time++;
                if(x!=x2){
                    x+=xStep;
                }
                if(y!=y2){
                    y+=yStep;
                }
            }
        }
        return time;
    }
}
