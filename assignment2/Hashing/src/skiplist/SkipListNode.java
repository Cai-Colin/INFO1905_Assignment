package skiplist;

public class SkipListNode<K extends Comparable<K>, V> implements Comparable<SkipListNode<K, V>>
{

	private K key;
	private V value;
	private boolean positive;
	
	private SkipListNode<K, V> prev;
	private SkipListNode<K, V> next;
	private SkipListNode<K, V> above;
	private SkipListNode<K, V> below;
	
	SkipListNode(K key, V value)
	{
		this.key = key;
		this.value = value;
		//null if non-sentinel
		//false if negative infinity
		//true if positive infinity
		this.positive = false;
		
		this.prev = null;
		this.next = null;
		this.above = null;
		this.below = null;
	}
	
	SkipListNode(boolean positive)
	{
		this.key = null;
		this.value = null;
		this.positive = positive;
		
		this.prev = null;
		this.next = null;
		this.above = null;
		this.below = null;
	}

	public K getKey()
	{
		return this.key;
	}
	
	public V getValue()
	{
		return this.value;
	}
	
	public SkipListNode<K, V> getPrev()
	{
		return this.prev;
	}
	
	public SkipListNode<K, V> getNext()
	{
		return this.next;
	}
	
	public SkipListNode<K, V> getAbove()
	{
		return this.above;
	}
	
	public SkipListNode<K, V> getBelow()
	{
		return this.below;
	}
	

	public void setValue(V newValue)
	{
		this.value = newValue;
	}
	
	public void setPrev(SkipListNode<K, V> prev)
	{
		this.prev = prev;
	}
	
	public void setNext(SkipListNode<K, V> next)
	{
		this.next = next;
	}
	
	public void setAbove(SkipListNode<K, V> above)
	{
		this.above = above;
	}
	
	public void setBelow(SkipListNode<K, V> below)
	{
		this.below = below;
	}

	@Override
	public int compareTo(SkipListNode<K, V> other)
	{
		if(this.getKey() != null)
		{
			return this.getKey().compareTo(other.getKey());
		}
		else
		{
			return (this.positive) ? 1 : -1;
		}
	}
	
	public int compareTo(K other)
	{
		if(this.getKey() != null)
		{
			return this.getKey().compareTo(other);
		}
		else
		{
			return (this.positive) ? 1 : -1;
		}
	}
}
