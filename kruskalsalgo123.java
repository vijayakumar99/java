import java.io.*;  
class Edge123
{
 int v1,v2,wt;   // wt is the weight of the edge
}
class kruskalsalgo123
{
public static void main(String args[])throws IOException 
{ 
int i,j,mincost=0;
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.println(" Enter no.of vertices:");
int v=Integer.parseInt(br.readLine());
System.out.println(" Enter no.of edges:");
int e=Integer.parseInt(br.readLine());
 Edge123 ed[]=new Edge123[e+1];
for(i=1;i<=e;i++)
{
 ed[i]=new Edge123();
 System.out.println(" Enter the vertices and the weight of edge "+(i)+ ":"); 
 ed[i].v1=Integer.parseInt(br.readLine());
 ed[i].v2=Integer.parseInt(br.readLine());
 ed[i].wt=Integer.parseInt(br.readLine());
}
for(i=1;i<=e;i++)      // sorting the edges in ascending order
 for(j=1;j<=e-1;j++)
{
 if(ed[j].wt>ed[j+1].wt)
 {
   Edge123 t=new Edge123();
    t=ed[j];
    ed[j]=ed[j+1];
    ed[j+1]=t;
}
}

int visited[]=new int[v+1];       // array to check whether the vertex is visited or not
for(i=1;i<=v;i++)
 visited[i]=0;
System.out.println("MINIMUM SPANNING TREE :");


for(i=1;i<=e;i++)
{ 
 if(i>v)
  break;
else if( visited[ed[i].v1]==0 || visited[ed[i].v2]==0)
 {
    System.out.println(ed[i].v1+ "-"+ ed[i].v2);
    visited[ed[i].v1]=visited[ed[i].v2]=1;
    mincost+=ed[i].wt;
 }
}
System.out.println("MINIMUM COST = " +mincost);
}
}
