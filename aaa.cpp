#include<stdio.h>
#include<stdlib.h> 
#include<stdio.h>
#include<string.h>
#include<conio.h>

#define YYY1 "-----------------------男运动员信息-------------------------\n"
#define YYY2 "| number | school   |  name | old | program |socre|mingci|\n"
#define YYY3 "|--------|----------|-------|-----|---------|-----|------|\n"
#define DDD  "|%-8s|%-10s|%-7s|%-5d|%-9s|%-5d|%-6d|\n"
#define DATA   p->data.number,p->data.shcool,p->data.name,p->data.old,p->data.pro,p->data.socre,p->data.mingci

#define YYY4 "-----------------------女运动员信息-------------------------\n"
#define YYY5 "| number | school   |  name | old | program |socre|mingci|\n"
#define YYY6 "|--------|----------|-------|-----|---------|-----|------|\n"
#define DDD2  "|%-8s|%-10s|%-7s|%-5d|%-9s|%-5d|%-6d|\n"
#define DATA2  p2->data.number,p2->data.shcool,p2->data.name,p2->data.old,p2->data.pro,p2->data.socre,p2->data.mingci

#define YYY7  "-------------------------学校信息------------------------|\n"
#define YYY8  "|snumber|sname|manprogam|womprogam|tatal|\n"
#define YYY9  "|-------|-----|---------|---------|-----|\n"
#define DDD3  "|%-7s|%-5s|%-9s|%-9s|%-5d|\n"
#define DATA3 p3->data.snumber,p3->data.sname,p3->data.manpro,p3->data.wonpro,p3->data.tatal

struct manathlete
{
	char number[10];
	char shcool[10];
	char name[10];
	int old;
	char pro[10];
	int socre;
	int mingci;
};
typedef struct node1
{
	struct manathlete data;
	struct node1 *next;
}Node1,*mlink;
struct wonathlete
{
	char number[10];
	char shcool[10];
	char name[10];
	int old;
	char pro[10];
	int socre;
	int mingci;
};
typedef struct node2
{
	struct wonathlete data;
	struct node2 *next;
}Node2,*wlink;
struct school
{
	char snumber[10];
	char sname[10];
	char manpro[10];
	char wonpro[10];
	int tatal;
};
typedef struct node
{
	struct school data;
	struct node *next;
}Node,*link;
void menu()
{
	puts("\n\n");
	puts("\t\t|-----------校际运动会系统--------------|");
	puts("\t\t|            1.Infoinformation          |");
	puts("\t\t|            2.saveinformation          |");
	puts("\t\t|            3.modify                   |");
	puts("\t\t|            4.showinformation          |");
	puts("\t\t|            0.exit                     |");
	puts("\t\t|---------------------------------------|");
}

void Information(mlink head,wlink head2,link head3)
{
	char number[10];
	char snumber[10];
	char sname[10];
	int count,countl,item,item2,w;
	
	node1 *p,*t,*s;
	node2 *p2,*t2,*s2; 
	node *p3,*t3,*s3;
	t=head;
	t2=head2;
	t3=head3;
	while(t->next!=NULL)
		t=t->next;
	while(t2->next!=NULL)
		t2=t2->next;
	while(t3->next!=NULL)
		t3=t3->next;
			
	while(1)
	{
		
		while(1)//输入男运动员信息
		{
		lab1:printf("请输入男运动员编号(0-return):");
		scanf("%s",number);
		if(strcmp(number,"0")==0)
			break;
		s=head->next;
		while(s)
		{
				if(strcmp(s->data.number,number)==0)
				{
					printf("该%s学生已经存在！！！\n",number);
					goto lab1;
				}
			s=s->next;
		}
		p=(struct node1*)malloc(sizeof(struct node1)); 
		strcpy(p->data.number,number);
		printf("所属学校：");
		scanf("%s",p->data.shcool);
		printf("名字：");
		scanf("%s",p->data.name);
		printf("年龄：");
		scanf("%d",&p->data.old);
		printf("参赛项目：");
		scanf("%s",p->data.pro);
		printf("排名：");
		scanf("%d",&p->data.mingci); 
		
		w=p->data.mingci;//自动赋予得分 
		if(w=1)
			p->data.socre=5;
		else if(w=2)
			p->data.socre=3;
		else if(w=3)
			p->data.socre=2;
		else
			p->data.socre=0; 
		p->next==NULL;
		t->next=p;
		t=p;
		count++;
		}	
	while(1)//输入女运动员信息 
	{
		lab2:printf("请输入女运动员编号(0-return):");
		scanf("%s",number);
		if(strcmp(number,"0")==0)
			break;
		s2=head2->next;
		while(s2)
		{
			if(strcmp(s2->data.number,number)==0)
				{
					printf("该%s学生已经存在！！！\n",number);
					goto lab2;
				}	
			s2=s2->next;
		}
		p2=(struct node2*)malloc(sizeof(struct node2)); 
		strcpy(p2->data.number,number);
		printf("所属学校：");
		scanf("%s",p2->data.shcool);
		printf("名字：");
		scanf("%s",p2->data.name);
		printf("年龄：");
		scanf("%d",&p2->data.old);
		printf("参赛项目：");
		scanf("%s",p2->data.pro);
		printf("排名：");
		scanf("%d",&p2->data.mingci); 
		w=p2->data.mingci;//自动赋予得分 
		if(w=1)
			p2->data.socre=5;
		else if(w=2)
			p2->data.socre=3;
		else if(w=3)
			p->data.socre=2;
		else
			p->data.socre=0;
		p2->next==NULL;
		t2->next=p2;
		t2=p2;
		countl++;
		printf("cont=%d",countl);
	}	
				
	
	while(1)
	{
		int i,j;
		lab3:printf("请输入学校编号(0-return):");
		scanf("%s",snumber);
		if(strcmp(snumber,"0")==0)
			return;
		s3=head3->next;
		while(s3)
		{
			if(strcmp(s3->data.snumber,snumber)==0)
				{
					printf("该%s学校已存在！！！\n",snumber);
					goto lab3; 
				}
			s3=s3->next;
		}
		p3=(struct node*)malloc(sizeof(struct node));

		for(i=0;i<count;i++)
		{
			strcpy(p3->data.sname,p->data.shcool);
			strcpy(p3->data.snumber,snumber);
			printf("男子比赛项目：\n");
			strcpy(p3->data.manpro,p->data.pro); 
			item=item+p->data.socre;
		}
		for(j=0;j<countl;j++)
		{
			strcpy(p3->data.sname,p2->data.shcool);
			strcpy(p3->data.snumber,snumber);
			printf("女子比赛项目：\n");
			strcpy(p3->data.wonpro,p2->data.pro);
			item2=item2+p2->data.socre;
		}
		p3->data.tatal=item+item2;
		p3->next==NULL;
		t3->next=p3;
		t3=p3;
	}
		
	} 
}
//输出男运动员信息 
void printfyy()
{
	printf(YYY1);
	printf(YYY2);
	printf(YYY3);
}
void printfdata(mlink p)
{
	printf(DDD,DATA);
}
void showmath(mlink k)
{
	Node1 *p;
	p=k->next;
	printfyy();
	if(p==NULL)
		printf("no record\n");
	else
		while(p!=NULL)
		{
			printfdata( p);
			p=p->next;
		}	
}
//输出女运动员信息 
void printfyy2()
{
	printf(YYY4);
	printf(YYY5);
	printf(YYY6);
}
void printfdata2(wlink p2)
{
	printf(DDD2,DATA2);
}
void showwath(wlink k)
{
	Node2 *p2;
	p2=k->next;
	printfyy2();
	if(p2==NULL)
		printf("no record\n");
	else
		while(p2!=NULL)
		{
			printfdata2( p2);
			p2=p2->next;
		}	
}
//输出学校信息 
void printfyy3()
{
	printf(YYY7);
	printf(YYY8);
	printf(YYY9);
}
void printfdata3(link p3)
{
	printf(DDD3,DATA3);
}
void showshcool(link k)
{
	Node *p3; 
	p3=k->next;
	printfyy3();
	if(p3==NULL)
		printf("no record\n");
	else
		while(p3!=NULL)
		{
			printfdata3(p3);
			p3=p3->next;
		}	
}
int main()
{
	int sel;
	
	
	mlink K;
	K=(node1*)malloc(sizeof(node1));
	K->next=NULL;
	
	wlink L;
	L=(node2*)malloc(sizeof(node2));
	L->next=NULL;
	
	link J;
	J=(node*)malloc(sizeof(node));
	J->next=NULL;

	while(1)
	{
		menu();
		printf("请输入(0-4):");
		scanf("%d",&sel);
		switch(sel)
		{
			case 1: 
				Information(K,L,J) ;              
			       break;
			case 2:
			  	printf("saveinformation");        
			 	   break;
			case 3:
			 	printf("modify");                 
			       break;
			case 4:  
				showmath(K); showwath(L);  showshcool(J);              
			       break;
			default : printf("输入错误！！！");
		 } 
	}
	

}
