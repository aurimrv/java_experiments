package ds;

import ds.MeuItem;
import ds.Ordenacao;
import junit.framework.TestCase;

public class Marllos extends TestCase {

	public void test1_1e2() {
		MeuItem[] vet = new  MeuItem[20+1];
		int cont;
		int esq;
		int dir;
		boolean passou = true;
		//setup

		
		vet[1] = new MeuItem(4);
		vet[2] = new MeuItem(3);
		vet[3] = new MeuItem(2);
		vet[4] = new MeuItem(1);
		vet[5] = new MeuItem(0);
		vet[6] = new MeuItem(6);
		vet[7] = new MeuItem(78);
		vet[8] = new MeuItem(22);
		vet[9] = new MeuItem(23);
		vet[10] = new MeuItem(12);
		vet[11] = new MeuItem(14);
		vet[12] = new MeuItem(13);
		vet[13] = new MeuItem(12);
		vet[14] = new MeuItem(11);
		vet[15] = new MeuItem(10);
		vet[16] = new MeuItem(16);
		vet[17] = new MeuItem(78);
		vet[18] = new MeuItem(19);
		vet[19] = new MeuItem(15);
		vet[20] = new MeuItem(2);
		//setup
		
		Ordenacao.selecao(vet, 20);

		for(cont = 1; cont < 20; cont++){
			if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
				passou = false;
			}
		}
		assertTrue(passou);
	}

public void test2_1e2() {
		MeuItem[] vet = new  MeuItem[21];
		int cont;
		int esq;
		int dir;
		boolean passou = true;
		//setup

		
		vet[1] = new MeuItem(4);
		vet[2] = new MeuItem(3);
		vet[3] = new MeuItem(2);
		vet[4] = new MeuItem(1);
		vet[5] = new MeuItem(0);
		vet[6] = new MeuItem(6);
		vet[7] = new MeuItem(78);
		vet[8] = new MeuItem(22);
		vet[9] = new MeuItem(23);
		vet[10] = new MeuItem(12);
		vet[11] = new MeuItem(14);
		vet[12] = new MeuItem(13);
		vet[13] = new MeuItem(12);
		vet[14] = new MeuItem(11);
		vet[15] = new MeuItem(10);
		vet[16] = new MeuItem(16);
		vet[17] = new MeuItem(78);
		vet[18] = new MeuItem(19);
		vet[19] = new MeuItem(15);
		vet[20] = new MeuItem(2);
		//setup
		
		Ordenacao.insercao(vet, 20);

		for(cont = 1; cont < 20; cont++){
			if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
				passou = false;
			}
		}
		assertTrue(passou);
}

public void test3_1e2() {
	MeuItem[] vet = new  MeuItem[21];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.shellsort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}


public void test4_1e2() {
	MeuItem[] vet = new  MeuItem[21];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup


	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}

public void test5_1e2() {
	MeuItem[] vet = new  MeuItem[21];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup


	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.heapsort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}

/*AVL************************************************AVL***************************************************AVL*/
/*
public void test1_1_IS() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.selecao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test1_2_l1() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(0);
	vet[2] = new MeuItem(1);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(3);
	vet[5] = new MeuItem(4);
	vet[6] = new MeuItem(5);
	vet[7] = new MeuItem(10);
	vet[8] = new MeuItem(11);
	vet[9] = new MeuItem(12);
	vet[10] = new MeuItem(13);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(15);
	vet[13] = new MeuItem(16);
	vet[14] = new MeuItem(19);
	vet[15] = new MeuItem(20);
	vet[16] = new MeuItem(77);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(79);
	vet[19] = new MeuItem(80);
	vet[20] = new MeuItem(90);
	//setup
	
	Ordenacao.selecao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}
/*
public void test1_2_l2() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.selecao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test1_2_l3() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(90);
	vet[2] = new MeuItem(80);
	vet[3] = new MeuItem(79);
	vet[4] = new MeuItem(78);
	vet[5] = new MeuItem(77);
	vet[6] = new MeuItem(20);
	vet[7] = new MeuItem(19);
	vet[8] = new MeuItem(16);
	vet[9] = new MeuItem(15);
	vet[10] = new MeuItem(14);
	vet[11] = new MeuItem(13);
	vet[12] = new MeuItem(12);
	vet[13] = new MeuItem(11);
	vet[14] = new MeuItem(10);
	vet[15] = new MeuItem(5);
	vet[16] = new MeuItem(4);
	vet[17] = new MeuItem(3);
	vet[18] = new MeuItem(2);
	vet[19] = new MeuItem(1);
	vet[20] = new MeuItem(0);
	//setup
	
	Ordenacao.selecao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}


//////////////////////////////////////////////

/*
public void test2_1_IS() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.insercao(v, n)(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test2_2_l1() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(0);
	vet[2] = new MeuItem(1);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(3);
	vet[5] = new MeuItem(4);
	vet[6] = new MeuItem(5);
	vet[7] = new MeuItem(10);
	vet[8] = new MeuItem(11);
	vet[9] = new MeuItem(12);
	vet[10] = new MeuItem(13);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(15);
	vet[13] = new MeuItem(16);
	vet[14] = new MeuItem(19);
	vet[15] = new MeuItem(20);
	vet[16] = new MeuItem(77);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(79);
	vet[19] = new MeuItem(80);
	vet[20] = new MeuItem(90);
	//setup
	
	Ordenacao.insercao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}
/*
public void test2_2_l2() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.selecao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test2_2_l3() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(90);
	vet[2] = new MeuItem(80);
	vet[3] = new MeuItem(79);
	vet[4] = new MeuItem(78);
	vet[5] = new MeuItem(77);
	vet[6] = new MeuItem(20);
	vet[7] = new MeuItem(19);
	vet[8] = new MeuItem(16);
	vet[9] = new MeuItem(15);
	vet[10] = new MeuItem(14);
	vet[11] = new MeuItem(13);
	vet[12] = new MeuItem(12);
	vet[13] = new MeuItem(11);
	vet[14] = new MeuItem(10);
	vet[15] = new MeuItem(5);
	vet[16] = new MeuItem(4);
	vet[17] = new MeuItem(3);
	vet[18] = new MeuItem(2);
	vet[19] = new MeuItem(1);
	vet[20] = new MeuItem(0);
	//setup
	
	Ordenacao.insercao(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}


//////////////////////////////////////////////

/*
public void test3_1_IS() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.shellsort(v, n)(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test3_2_l1() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(0);
	vet[2] = new MeuItem(1);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(3);
	vet[5] = new MeuItem(4);
	vet[6] = new MeuItem(5);
	vet[7] = new MeuItem(10);
	vet[8] = new MeuItem(11);
	vet[9] = new MeuItem(12);
	vet[10] = new MeuItem(13);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(15);
	vet[13] = new MeuItem(16);
	vet[14] = new MeuItem(19);
	vet[15] = new MeuItem(20);
	vet[16] = new MeuItem(77);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(79);
	vet[19] = new MeuItem(80);
	vet[20] = new MeuItem(90);
	//setup
	
	Ordenacao.shellsort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}
/*
public void test3_2_l2() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.shellsort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test3_2_l3() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(90);
	vet[2] = new MeuItem(80);
	vet[3] = new MeuItem(79);
	vet[4] = new MeuItem(78);
	vet[5] = new MeuItem(77);
	vet[6] = new MeuItem(20);
	vet[7] = new MeuItem(19);
	vet[8] = new MeuItem(16);
	vet[9] = new MeuItem(15);
	vet[10] = new MeuItem(14);
	vet[11] = new MeuItem(13);
	vet[12] = new MeuItem(12);
	vet[13] = new MeuItem(11);
	vet[14] = new MeuItem(10);
	vet[15] = new MeuItem(5);
	vet[16] = new MeuItem(4);
	vet[17] = new MeuItem(3);
	vet[18] = new MeuItem(2);
	vet[19] = new MeuItem(1);
	vet[20] = new MeuItem(0);
	//setup
	
	Ordenacao.shellsort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}

///////////////////////////////////////////////////////////
/*
public void test4_1_IS() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.quicksort(v, n)(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test4_2_l1() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(0);
	vet[2] = new MeuItem(1);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(3);
	vet[5] = new MeuItem(4);
	vet[6] = new MeuItem(5);
	vet[7] = new MeuItem(10);
	vet[8] = new MeuItem(11);
	vet[9] = new MeuItem(12);
	vet[10] = new MeuItem(13);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(15);
	vet[13] = new MeuItem(16);
	vet[14] = new MeuItem(19);
	vet[15] = new MeuItem(20);
	vet[16] = new MeuItem(77);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(79);
	vet[19] = new MeuItem(80);
	vet[20] = new MeuItem(90);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}
/*
public void test4_2_l2() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test4_2_l3() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(90);
	vet[2] = new MeuItem(80);
	vet[3] = new MeuItem(79);
	vet[4] = new MeuItem(78);
	vet[5] = new MeuItem(77);
	vet[6] = new MeuItem(20);
	vet[7] = new MeuItem(19);
	vet[8] = new MeuItem(16);
	vet[9] = new MeuItem(15);
	vet[10] = new MeuItem(14);
	vet[11] = new MeuItem(13);
	vet[12] = new MeuItem(12);
	vet[13] = new MeuItem(11);
	vet[14] = new MeuItem(10);
	vet[15] = new MeuItem(5);
	vet[16] = new MeuItem(4);
	vet[17] = new MeuItem(3);
	vet[18] = new MeuItem(2);
	vet[19] = new MeuItem(1);
	vet[20] = new MeuItem(0);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}

/////////////////////////////////////////////////////
/*
public void test5_1_IS() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.quicksort(v, n)(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test5_2_l1() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(0);
	vet[2] = new MeuItem(1);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(3);
	vet[5] = new MeuItem(4);
	vet[6] = new MeuItem(5);
	vet[7] = new MeuItem(10);
	vet[8] = new MeuItem(11);
	vet[9] = new MeuItem(12);
	vet[10] = new MeuItem(13);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(15);
	vet[13] = new MeuItem(16);
	vet[14] = new MeuItem(19);
	vet[15] = new MeuItem(20);
	vet[16] = new MeuItem(77);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(79);
	vet[19] = new MeuItem(80);
	vet[20] = new MeuItem(90);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}
/*
public void test5_2_l2() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(4);
	vet[2] = new MeuItem(3);
	vet[3] = new MeuItem(2);
	vet[4] = new MeuItem(1);
	vet[5] = new MeuItem(0);
	vet[6] = new MeuItem(6);
	vet[7] = new MeuItem(78);
	vet[8] = new MeuItem(22);
	vet[9] = new MeuItem(23);
	vet[10] = new MeuItem(12);
	vet[11] = new MeuItem(14);
	vet[12] = new MeuItem(13);
	vet[13] = new MeuItem(12);
	vet[14] = new MeuItem(11);
	vet[15] = new MeuItem(10);
	vet[16] = new MeuItem(16);
	vet[17] = new MeuItem(78);
	vet[18] = new MeuItem(19);
	vet[19] = new MeuItem(15);
	vet[20] = new MeuItem(2);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assert(passou == true);
}*/

public void test5_2_l3() {
	MeuItem[] vet = new  MeuItem[20+1];
	int cont;
	int esq;
	int dir;
	boolean passou = true;
	//setup

	
	vet[1] = new MeuItem(90);
	vet[2] = new MeuItem(80);
	vet[3] = new MeuItem(79);
	vet[4] = new MeuItem(78);
	vet[5] = new MeuItem(77);
	vet[6] = new MeuItem(20);
	vet[7] = new MeuItem(19);
	vet[8] = new MeuItem(16);
	vet[9] = new MeuItem(15);
	vet[10] = new MeuItem(14);
	vet[11] = new MeuItem(13);
	vet[12] = new MeuItem(12);
	vet[13] = new MeuItem(11);
	vet[14] = new MeuItem(10);
	vet[15] = new MeuItem(5);
	vet[16] = new MeuItem(4);
	vet[17] = new MeuItem(3);
	vet[18] = new MeuItem(2);
	vet[19] = new MeuItem(1);
	vet[20] = new MeuItem(0);
	//setup
	
	Ordenacao.quicksort(vet, 20);

	for(cont = 1; cont < 20; cont++){
		if(((Integer)vet[cont].recuperaChave()).intValue() > ((Integer)vet[cont+1].recuperaChave()).intValue()){
			passou = false;
		}
	}
	assertTrue(passou);
}


}
