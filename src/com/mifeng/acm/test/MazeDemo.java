package com.mifeng.acm.test;

import java.util.Arrays;
import java.util.Scanner;

public class MazeDemo {
	//static int[][] maz = new int[][]{{0, 0, 0, 1, 0}, {1, 1, 0, 1, 0}, {0, 1, 1, 0,1}, {1, 0, 0, 1, 1}, {0,1,1,1,0}};
	static boolean[][] visited = new boolean[5][5];
	//定义一个数组表示方向
	static int[] offsetX = {1, 0, -1, 0};
	static int[] offsetY = {0, 1, 0, -1};
	static int[][] maze = new int[5][5];
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(maz[2]));
		Scanner in = new Scanner(System.in);
		//int[][] maze = new int[5][5];
//		static boolean[][] visted = new boolean[5][5];
//		//定义一个数组表示方向
//		static int[] offsetX = {1, 0, -1, 0};
//		static int[] offsetY = {0, 1, 0, -1};
		//1、输入矩阵
		for(int i = 0; i<5;i++){
			for(int j = 0; j<5; j++){
				maze[i][j] = in.nextInt();
			}
		}

		//int result = dfs(maze);
		visited[0][0] = true;
		boolean result = dfs(maze, 0, 0, 4, 4);
		System.out.println(result);
	}
	
	public static boolean dfs(int[][] maze, int startX, int startY, int endX, int endY){
		if(startX >=5||startY >=5 && endX >=5||endY>=5 || startX<0||startY<0||endX<0||endY<0){
			return false;
		}
		//if()
		else if(startX == endX && startY == endY){
			return true;
		}
		//if()
		for(int k =0;k<4;k++){
			if((startX+offsetX[k]<5 && startX+offsetX[k]>=0) && (startY+offsetY[k]<5) && startY+offsetY[k]>=0 ){
				if(maze[startX+offsetX[k]][startY+offsetY[k]]!=1){
					if(!visited[startX+offsetX[k]][startY+offsetY[k]]){
						
						visited[startX+offsetX[k]][startY+offsetY[k]] = true;
						dfs(maze,startX+offsetX[k],startY+offsetY[k],endX,endY);
					}
				}
				
			}
			
		}
		return false;
	}
}
