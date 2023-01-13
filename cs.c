#include <stdio.h>

//structure that defines the attributes of a CT/T player

struct terrorist{
	int  dHP, dArmor, dKillCtr, dDied;
	char sPlayerName[20], cHasBomb;
	double dKDR;

	struct terrorist *t;


}; //will use local variables later on


//function prototypes here

void printTerroristRef();
void printTerroristVal();



	

int main(int argc, char const *argv[]){

	//local variable 

	struct terrorist player1,player2,player3,player[100];
	
	//user input

	//get player 1

	printf("\nEnter name of player1: ");
	scanf("%s", player1.sPlayerName); //no &
	printf("\nDoes %s have the bomb? 1 - yes, 0 - no ", player1.sPlayerName);
	scanf(" %c", &player1.cHasBomb);
	//adding hp
	player1.dHP = 100;
	printf("\nHow many kills did %s already have: ",player1.sPlayerName );
	scanf("%d", &player1.dKillCtr);
	printf("\nHow many deaths did %s already have: ",player1.sPlayerName );
	scanf("%d", &player1.dDied);

	printTerroristRef(&player1); //pass a pointer 
	printTerroristVal(player1); //pass a value stoopid

	//compute for kdr 

	player1.dKDR = player1.dKillCtr/player1.dDied;

	//print player2

	printTerroristRef(&player2); //pass a pointer 
	printTerroristRef(player2); //pass a value stoopid

	printf("\nEnter name of player2: ");
	scanf("%s", player2.sPlayerName); //no &
	printf("\nDoes %s have the bomb? 1 - yes, 0 - no ", player2.sPlayerName);
	scanf(" %c", &player2.cHasBomb);
	//assing hp
	player2.dHP = 100;
	printf("\nHow many kills did %s already have: ",player2.sPlayerName );
	scanf("%d", &player2.dKillCtr);
	printf("\nHow many deaths did %s already have: ",player2.sPlayerName );
	scanf("%d", &player2.dDied);

	//compute for kdr 

	player2.dKDR = player2.dKillCtr/player2.dDied;


	// connect player 1 to player 2 
	player1.t  = &player2;

	//print player 2

	





	return 0;
}//end main

// function defs 

void printTerroristRef(struct terrorist *t){

	printf("\nPlayer Name: %s ", t->sPlayerName); // pass by reference 
	printf("\nHas bomb: %c ", t->cHasBomb);
	printf("\nPlayer HP: %d ", t->dHP);
	printf("\nHas kills: %d ", t->dKillCtr);
	printf("\nHas died: %d ", t->dDied);
	printf("\nHas kills: %.2lf ", t->dKDR);




}//end ref

void printTerroristVal(struct terrorist t){

	printf("\nPlayer Name: %s ", t.sPlayerName); //pass by value
	printf("\nPlayer Name: %s ", t.sPlayerName);  
	printf("\nHads bomb: %c ", t.cHasBomb);
	printf("\nPlayer HP: %d ", t.dHP);
	printf("\nHas kills: %d ", t.dKillCtr);
	printf("\nHas died: %d ", t.dDied);
	printf("\nHas kills: %.2lf ", t.dKDR);

}// end val 