package hashmap_implementation;

public class HashMapImplementation {
Entry[] buckets= new Entry[16];
int size=16;
private int getBucketIndex(int key) {
	return (Math.abs(Integer.hashCode(key))%(size));
}
public void put(int key,int value) {
	Entry node = new Entry(key,value);
	int index = getBucketIndex(key);
	Entry current =buckets[index];
	while(current != null) {
		if(current.key==key) {
			current.value=value;
			return;
		}
		current=current.next;
	}
	node.next = buckets[index];
	buckets[index] = node;
	}
public int getValue(int key) {
    int index = getBucketIndex(key);
    Entry current = buckets[index];
    while (current != null) {
        if (current.key == key)
            return current.value;
        current = current.next;
    }
    throw new RuntimeException("Key not found: " + key);
}

public void display() {
	for(int i=0;i<buckets.length;i++)
	{
		Entry current = buckets[i];
		if(current==null)
			continue;
		while(current!=null)
		{
			System.out.println("< "+current.key+" , "+current.value+" >");
			current=current.next;
		}
		
	}
}



public static void main(String[] args) {
	HashMapImplementation map = new HashMapImplementation();
	map.put(10, 1);
	System.out.println( map.getValue(10));
	map.display();
}
}
