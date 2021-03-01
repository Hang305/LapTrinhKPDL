/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhhdt_java.Chuong05.Logic;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Admin
 */
public class TreeDemoModel implements TreeModel {
    
    DefaultTreeModel tree;
    DefaultMutableTreeNode rootNode;
    
    public TreeDemoModel() {
        rootNode = buildTree("Car&Motor");
        tree = new DefaultTreeModel(rootNode);
    }
    
    public TreeDemoModel(DefaultTreeModel tree, DefaultMutableTreeNode rootNode) {
        this.tree = tree;
        this.rootNode = rootNode;
    }
    
    public DefaultTreeModel getTree() {
        return tree;
    }
    
    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }
    
    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }
    
    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }
    
    private DefaultMutableTreeNode buildTree(String rootName) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        //xây dựng các nút con cho nút gốc
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");

        //đưa vào nút root
        root.add(car);
        root.add(motor);

        //xây dựng nút con cho car
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");
        DefaultMutableTreeNode maxda = new DefaultMutableTreeNode("Maxda");
        car.add(honda);
        
        car.add(toyota);
        car.add(maxda);

        //xây dựng các nút con cho motor
        DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("Suzuki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
        motor.add(yamaha);
        motor.add(suzuki);

        // trả về nút gốc của cây
        return root;
    }
    
    @Override
    public Object getRoot() {
        return this.rootNode;
    }
    
    @Override
    public Object getChild(Object parent, int index) {
        return tree.getChild(parent, index);
    }
    
    @Override
    public int getChildCount(Object parent) {
        return tree.getChildCount(parent);
    }
    
    @Override
    public boolean isLeaf(Object node) {
        return tree.isLeaf(node);
    }
    
    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        tree.valueForPathChanged(path, newValue);
    }
    
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        return tree.getChildCount(parent);
    }
    
    @Override
    public void addTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }
    
    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.addTreeModelListener(l);
    }
    
}
