let count = 0;

count = 0;
do {
	console.log(count); // 0 1 2
	count++;
} while (count < 3);

count = 4;
do {
	console.log(count); // 4
	count++;
} while (count < 3);
