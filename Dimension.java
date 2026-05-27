//KIT107 Assignment 3
/**
 * Queue ADT
 *
 * @author << Chathumal Karunanayaka - 755936 & Thavisha Perera - 771066 >>
 * @version << 27/05/2026 >>
 * * This file holds the Queue ADT.  The Queue is built
 * using a linked list of Node ADTs.  A Queue object
 * consists of a "first" field which refers to a Node
 * object.
 * * YOU NEED TO MAKE CHANGES TO THIS FILE!
*/


public class Queue implements QueueInterface
{
    //finals
    protected final boolean TRACING=true;               // do we want to see trace output?

    // non-finals
    protected Node first;       // the node at the front of the queue


    /*
     * Queue
     * Constructor method 1.
     * Pre-condition: none
     * Post-condition: the Queue object's "first" field is null
     * Informally: intialises the instance variable of the newly
     * created Queue object by terminating the
     * "first" field
    */
    public Queue()
    {
        trace("Queue: Constructor starts");

        first=null;

        trace("Queue: Constructor ends");
    }


    /**
     * Queue
     * Constructor method 2.
     * Pre-condition: none
     * Post-condition: the Queue object holds a reference to a Node
     * object within its "first" field which holds
     * the parameter value (o)
     * Informally: intialises the instance variable ("first") of
     * the newly created Queue object to hold a
     * reference to a new Node object containing the
     * given parameter
     *
     * @param o the Object to store in the queue
    */
    public Queue(Object o)
    {
        trace("Queue: Constructor starts");

        first=new Node(o);

        trace("Queue: Constructor ends");
    }

    
    /**
     * isEmpty
     * Pre-condition: none
     * Post-condition: true is returned if the Queue object has no
     * items, false is returned if it does
     * Informally: examine the Queue object's first instance variable
     * returning whether or not it is null
     *
     * @return boolean whether or not the queue is empty
    */
    public boolean isEmpty()
    {
        trace("isEmpty: isEmpty starts and ends");

        // Check if the first node is null to determine if queue is empty
        return first == null;
    }


    /**
     * front
     * Examine the first item in the queue.
     * Pre-condition: the queue is non-empty
     * Post-condition: a reference to the item at the front of the
     * queue is returned
     * Informally: return a reference to the front of the Queue or
     * throw an exception if the Queue is empty
     *
     * @return Object the item at the head of the queue
    */
    public Object front() throws EmptyQueueException
    {
        trace("front: front starts");

        if (isEmpty())
        {
            trace("front: queue is empty");
            throw new EmptyQueueException();
        }
        else
        {
            trace("front: front ends");

            // Return the data stored inside the first node
            return first.getData();
        }
    }


    /**
     * remove
     * Delete the head of the queue.
     * Pre-condition: the queue is non-empty
     * Post-condition: the "first" instance variable is re-assigned
     * to refer to the value of the second Node
     * object in the linked list
     * Informally: bypass the node at the front of the Queue so that
     * the second node in the Queue becomes the front.
     * If the Queue is empty, throw an exception
    */
    public void remove() throws EmptyQueueException
    {
        trace("remove: remove starts");

        if (isEmpty())
        {
            trace("remove: queue is empty");
            throw