# Objective

Interfaces are very flexible.

We can specify functions and signature that must be defined in an interface.
And any struct or type that define the functions and signatures of a certain interface 
, we say, are implementing those interfaces.

In the case of Go we don't need to explicitly tell that a certain struct is
implementing an interface.
I think that is why some say that Go uses Duck typing.
If the struct has the necessary methods, then the compiler will know that
the struct is implementing an interface.
In the case of Java or Python we need to explicit tell that a certain class
implements an interface.

## About properties and attributes

What if we wanted to make sure a certain type Y had a certain property of type X.
And let's say that this property X is very important for other function calls that
come afterwards...

```Go
type Y struct {
    x X
}
```

The interface as it is cannot specify or enforce properties/attributes, only 
functions and signatures.

But we could just build a method that returns a certain property...

Or even better the type Y (that should be implementing the interface) doesn't
need to have the property X necessarily. The type Y could just derive it.

Let's say that type Y has property Z, which is not property X.

```Go
type Y struct {
    z Z
}
```

But Y could have a method that transforms Z into X.
This is more flexible than having the property X in itself.

```Go
func (y Y) getProperty X {
    // make transformation of y.z into an X type
    return x
}
```

This is a way that we can encapsulate/hide how the type/struct will return this
property X. It could have some complex transformation behind the scenes. Or it could
just be a simple access of the field in the struct.

For the interface it does not matter. And for the code that depends or is
interacting with the interface it does not matter how this is done. All that matters
for them is that calling a method `getProperty` will return a certain type `X`.

Let's try to build a simple example where we use this knowledge to gain
flexibility and create dependency inversion.

## About the two ways to use interfaces and structs/classes

I try to separate the behavior and state in two different groups of classes/structs.

That is I try to create classes/structs that are mainly concerned with behavior.
And another group of classes/structs that are mainly concerned about holding state.

For both groups we can use interfaces create an abstraction layer around it.

For the state structs we use interfaces to just access some information of the
struct. Or derive information of the struct.

For the behavior structs we use interfaces when we just want to change slightly
the behavior between different ways of doing things.
