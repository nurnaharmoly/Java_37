
package cha24;



public abstract class MyAbstractlist<E> implements MyList<E>{
  protected int size = 0;
    protected MyAbstractlist(){
    }
    
    protected MyAbstractlist(E[] objects){
    for(int i = 0; i < objects.length; i++)
        add(objects[i]);
  }
  @Override
    public void add(E e){
        add(size, e);
    }
    
  @Override
    public boolean isEmpty(){
     return size == 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int size(){
    return size;
    }
    
    /**
     *
     * @param e
     * @return
     */
    @Override
    public boolean remove(E e){
    if(indexOf(e) >= 0){
        remove(indexOf(e));
        return true;
    }
    else
        return false;
    }

   

   
    }

   
    
    
