package exercises.e14;

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}
