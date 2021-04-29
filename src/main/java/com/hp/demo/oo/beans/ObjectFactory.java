
package com.hp.demo.oo.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hp.demo.oo.beans package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Root_QNAME = new QName("", "root");
    private final static QName _AttributeTypeRef_QNAME = new QName("", "ref");
    private final static QName _AttributeTypeNode_QNAME = new QName("", "node");
    private final static QName _AttributeTypeCollection_QNAME = new QName("", "collection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hp.demo.oo.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RootType }
     * 
     */
    public RootType createRootType() {
        return new RootType();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link ChildType }
     * 
     */
    public ChildType createChildType() {
        return new ChildType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link RefType }
     * 
     */
    public RefType createRefType() {
        return new RefType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RootType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "root")
    public JAXBElement<RootType> createRoot(RootType value) {
        return new JAXBElement<RootType>(_Root_QNAME, RootType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ref", scope = AttributeType.class)
    public JAXBElement<RefType> createAttributeTypeRef(RefType value) {
        return new JAXBElement<RefType>(_AttributeTypeRef_QNAME, RefType.class, AttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "node", scope = AttributeType.class)
    public JAXBElement<NodeType> createAttributeTypeNode(NodeType value) {
        return new JAXBElement<NodeType>(_AttributeTypeNode_QNAME, NodeType.class, AttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "collection", scope = AttributeType.class)
    public JAXBElement<CollectionType> createAttributeTypeCollection(CollectionType value) {
        return new JAXBElement<CollectionType>(_AttributeTypeCollection_QNAME, CollectionType.class, AttributeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ref", scope = CollectionType.class)
    public JAXBElement<RefType> createCollectionTypeRef(RefType value) {
        return new JAXBElement<RefType>(_AttributeTypeRef_QNAME, RefType.class, CollectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "node", scope = CollectionType.class)
    public JAXBElement<NodeType> createCollectionTypeNode(NodeType value) {
        return new JAXBElement<NodeType>(_AttributeTypeNode_QNAME, NodeType.class, CollectionType.class, value);
    }

}
