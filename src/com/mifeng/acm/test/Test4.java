//package com.mifeng.acm.test;
//
//public class Test4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	public void solve() {  
//	       for(int i = 1; i < v.length; i++) {  
//	            for(int k = 1; k <= weight; k++) {  
//	                if(w[i] <= k) {  
//	                    if(v[i] + c[i - 1][k - w[i]] > c[i - 1][k])  
//	                        c[i][k] = v[i] + c[i - 1][k - w[i]];  
//	                    else  
//	                        c[i][k] = c[i - 1][k];  
//	                } else  
//	                    c[i][k] = c[i - 1][k];  
//	            }  
//	        }  
//	    }  
//	
//
//int KnapSack(int n,int w[],int v[],int x[],int C)
//{
//    int i,j;
//    for(i=0;i<=n;i++)
//        V[i][0]=0;
//    for(j=0;j<=C;j++)
//        V[0][j]=0;
//    for(i=0;i<=n-1;i++)
//        for(j=0;j<=C;j++)
//            if(j<w[i])
//                V[i][j]=V[i-1][j];
//            else
//                V[i][j]=max(V[i-1][j],V[i-1][j-w[i]]+v[i]);
//            j=C;
//            for(i=n-1;i>=0;i--)
//            {
//                if(V[i][j]>V[i-1][j])
//                {
//                x[i]=1;
//                j=j-w[i];
//                }
//            else
//                x[i]=0;
//            }
//            printf("选中的物品是:\n");
//            for(i=0;i<n;i++)
//                printf("%d ",x[i]);
//            printf("\n");
//        return V[n-1][C];
//        
//}
//}
