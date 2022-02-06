package com.hbsoft.opc.informationmodel;
import java.util.List;
import java.io.InputStream;
import org.opcfoundation.ua.encoding.EncoderContext;
import org.opcfoundation.ua.encoding.binary.BinaryDecoder;
import org.opcfoundation.ua.encoding.DecodingException;
import org.opcfoundation.ua.builtintypes.DataValue;
import java.util.ArrayList;
import java.io.IOException;
import org.opcfoundation.ua.builtintypes.QualifiedName;
import org.opcfoundation.ua.builtintypes.LocalizedText;

import org.opcfoundation.ua.builtintypes.Variant;
import org.opcfoundation.ua.core.NodeClass;
import org.opcfoundation.ua.core.ReferenceNode;
import org.opcfoundation.ua.builtintypes.ExpandedNodeId;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.builtintypes.UnsignedByte;
import org.opcfoundation.ua.common.NamespaceTable;
import opc.sdk.server.core.UAServerApplicationInstance;
import opc.sdk.core.node.NodeIdUtil;
import opc.sdk.core.node.Node;
import opc.sdk.core.node.UADataTypeNode;
import opc.sdk.core.node.UAMethodNode;
import opc.sdk.core.node.UAObjectNode;
import opc.sdk.core.node.UAObjectTypeNode;
import opc.sdk.core.node.UAReferenceTypeNode;
import opc.sdk.core.node.UAVariableTypeNode;
import opc.sdk.server.service.node.UAServerVariableNode;
import opc.sdk.server.service.node.UAServerObjectNode;
public class Model2 {
private void add0(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15754, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15745, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15746, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15749, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15751, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,15744) , NodeClass.valueOf(8) ,new QualifiedName(0,"TemporaryFileTransferType") , new LocalizedText("TemporaryFileTransferType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2090, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2092, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2091) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditAddNodesEventType") , new LocalizedText("AuditAddNodesEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15744, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15745) , NodeClass.valueOf(2) ,new QualifiedName(0,"ClientProcessingTimeout") , new LocalizedText("ClientProcessingTimeout","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(0),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2091, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2092) , NodeClass.valueOf(2) ,new QualifiedName(0,"NodesToAdd") , new LocalizedText("NodesToAdd","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,376) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15744, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15747, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15748, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15746) , NodeClass.valueOf(4) ,new QualifiedName(0,"GenerateFileForRead") , new LocalizedText("GenerateFileForRead","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2090, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2094, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2093) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditDeleteNodesEventType") , new LocalizedText("AuditDeleteNodesEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15746, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15747) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(1),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2093, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2094) , NodeClass.valueOf(2) ,new QualifiedName(0,"NodesToDelete") , new LocalizedText("NodesToDelete","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,382) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15746, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15748) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(2),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2090, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2096, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2095) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditAddReferencesEventType") , new LocalizedText("AuditAddReferencesEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15744, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15750, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16359, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15749) , NodeClass.valueOf(4) ,new QualifiedName(0,"GenerateFileForWrite") , new LocalizedText("GenerateFileForWrite","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2095, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2096) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReferencesToAdd") , new LocalizedText("ReferencesToAdd","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,379) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15749, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15750) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(3),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2090, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2098, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2097) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditDeleteReferencesEventType") , new LocalizedText("AuditDeleteReferencesEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15744, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15752, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15753, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15751) , NodeClass.valueOf(4) ,new QualifiedName(0,"CloseAndCommit") , new LocalizedText("CloseAndCommit","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2097, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2098) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReferencesToDelete") , new LocalizedText("ReferencesToDelete","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,385) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15751, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15752) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(4),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2052, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2104, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2100, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2099) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditUpdateEventType") , new LocalizedText("AuditUpdateEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15751, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15753) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(5),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2099, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2750, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2101, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2102, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2103, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2100) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditWriteUpdateEventType") , new LocalizedText("AuditWriteUpdateEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15744, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15755, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15794, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15754) , NodeClass.valueOf(1) ,new QualifiedName(0,"<TransferState>") , new LocalizedText("<TransferState>","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2100, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2101) , NodeClass.valueOf(2) ,new QualifiedName(0,"IndexRange") , new LocalizedText("IndexRange","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,291) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15754, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2760, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15756, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15755) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentState") , new LocalizedText("CurrentState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2100, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2102) , NodeClass.valueOf(2) ,new QualifiedName(0,"OldValue") , new LocalizedText("OldValue","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15755, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15756) , NodeClass.valueOf(2) ,new QualifiedName(0,"Id") , new LocalizedText("Id","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(6),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2100, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2103) , NodeClass.valueOf(2) ,new QualifiedName(0,"NewValue") , new LocalizedText("NewValue","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2099, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2999, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2751, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3006, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3012, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2104) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditHistoryUpdateEventType") , new LocalizedText("AuditHistoryUpdateEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10637, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,18496) , NodeClass.valueOf(8) ,new QualifiedName(0,"SystemDiagnosticAlarmType") , new LocalizedText("SystemDiagnosticAlarmType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15677, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15766) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedDataSetDataType") , new LocalizedText("PublishedDataSetDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(7),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15678, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15769) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedDataSetSourceDataType") , new LocalizedText("PublishedDataSetSourceDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(8),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15679, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15772) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedDataItemsDataType") , new LocalizedText("PublishedDataItemsDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(9),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15681, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15775) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedEventsDataType") , new LocalizedText("PublishedEventsDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(10),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15682, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15778) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetWriterDataType") , new LocalizedText("DataSetWriterDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(11),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2052, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2128, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12561, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2790, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17641, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18011, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2315, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2129, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,3065) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18666, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2127) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditUpdateMethodEventType") , new LocalizedText("AuditUpdateMethodEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15683, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15781) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetWriterTransportDataType") , new LocalizedText("DataSetWriterTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(12),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2127, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2128) , NodeClass.valueOf(2) ,new QualifiedName(0,"MethodId") , new LocalizedText("MethodId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(13),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2127, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2129) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7591) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(14),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2041, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15535, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11446, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2787, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2788, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2789, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2131, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2130) , NodeClass.valueOf(8) ,new QualifiedName(0,"SystemEventType") , new LocalizedText("SystemEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15688, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15784) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetWriterMessageDataType") , new LocalizedText("DataSetWriterMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(15),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2130, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2131) , NodeClass.valueOf(8) ,new QualifiedName(0,"DeviceFailureEventType") , new LocalizedText("DeviceFailureEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2041, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2133, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2132) , NodeClass.valueOf(8) ,new QualifiedName(0,"BaseModelChangeEventType") , new LocalizedText("BaseModelChangeEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",22, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15082, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",102, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8251, nsTable)));
nodes2add.add(new UADataTypeNode(NodeIdUtil.createNodeId(0,7594) , NodeClass.valueOf(64) ,new QualifiedName(0,"EnumValueType") , new LocalizedText("EnumValueType","") , new LocalizedText("A mapping between a value of an enumerated type and a name and description.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2132, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2134, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2133) , NodeClass.valueOf(8) ,new QualifiedName(0,"GeneralModelChangeEventType") , new LocalizedText("GeneralModelChangeEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",302, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7595) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(16),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15689, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15787) , NodeClass.valueOf(2) ,new QualifiedName(0,"PubSubGroupDataType") , new LocalizedText("PubSubGroupDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(17),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2133, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2134) , NodeClass.valueOf(2) ,new QualifiedName(0,"Changes") , new LocalizedText("Changes","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,877) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",303, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7596) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(18),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7597) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(19),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",315, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7598) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(20),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2137) , NodeClass.valueOf(16) ,new QualifiedName(0,"ServerVendorCapabilityType") , new LocalizedText("ServerVendorCapabilityType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-1,null,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2140, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2752, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2139, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2142, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2753, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2141, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2138) , NodeClass.valueOf(16) ,new QualifiedName(0,"ServerStatusType") , new LocalizedText("ServerStatusType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,862) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2138, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2139) , NodeClass.valueOf(2) ,new QualifiedName(0,"StartTime") , new LocalizedText("StartTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(21),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15691, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15793) , NodeClass.valueOf(2) ,new QualifiedName(0,"WriterGroupTransportDataType") , new LocalizedText("WriterGroupTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(22),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2138, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2140) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentTime") , new LocalizedText("CurrentTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(23),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15754, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15794) , NodeClass.valueOf(4) ,new QualifiedName(0,"Reset") , new LocalizedText("Reset","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2138, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2141) , NodeClass.valueOf(2) ,new QualifiedName(0,"State") , new LocalizedText("State","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,852) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2138, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3051, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3700, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3698, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3702, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3699, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3701, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3703, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2142) , NodeClass.valueOf(2) ,new QualifiedName(0,"BuildInfo") , new LocalizedText("BuildInfo","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,338) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",576, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7605) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(24),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2771, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15841, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15829, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15833, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15823, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15825, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15827, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15831, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15821, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15817, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15843, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15835, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15837, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15815, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15839, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15819, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,15803) , NodeClass.valueOf(8) ,new QualifiedName(0,"FileTransferStateMachineType") , new LocalizedText("FileTransferStateMachineType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add1(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",851, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7611) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(25),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2160, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2152, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2155, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2153, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2163, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2159, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2161, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2156, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2151, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2162, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2154, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2157, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2150) , NodeClass.valueOf(16) ,new QualifiedName(0,"ServerDiagnosticsSummaryType") , new LocalizedText("ServerDiagnosticsSummaryType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,859) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",852, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7612) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(26),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2151) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerViewCount") , new LocalizedText("ServerViewCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(27),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2152) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentSessionCount") , new LocalizedText("CurrentSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(28),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",890, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7614) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(29),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2153) , NodeClass.valueOf(2) ,new QualifiedName(0,"CumulatedSessionCount") , new LocalizedText("CumulatedSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(30),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2154) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityRejectedSessionCount") , new LocalizedText("SecurityRejectedSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(31),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7594, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8291, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,7616) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2155) , NodeClass.valueOf(2) ,new QualifiedName(0,"RejectedSessionCount") , new LocalizedText("RejectedSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(32),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",93, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",72, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8073, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8004, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17538, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7662, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11959, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7731, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8223, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15925, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15898, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15872, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7659, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15769, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12183, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7938, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15869, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12905, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15766, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8238, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8214, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15919, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7728, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15781, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8226, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18181, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15860, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8208, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11962, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15741, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15895, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8914, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17469, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14873, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18184, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12770, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7698, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15857, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15775, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15886, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15943, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15521, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12094, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21002, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15854, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15602, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21162, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15778, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7944, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17550, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8076, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12718, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7941, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7734, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8247, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8220, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15877, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15784, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15866, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14855, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7686, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7677, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8229, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15524, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15501, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14324, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14876, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7665, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7671, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18187, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12767, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15883, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14852, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7737, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7932, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7947, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7683, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21159, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7674, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21171, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15037, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7650, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21165, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15889, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8067, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8241, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12186, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15940, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15734, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15946, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7929, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14849, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12902, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12213, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15793, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21168, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15931, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8217, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15398, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15922, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14870, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12721, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12681, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",21156, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7935, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8211, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16131, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18178, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12091, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15772, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8235, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7619, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15738, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15787, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7782, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15880, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7617) , NodeClass.valueOf(2) ,new QualifiedName(0,"Opc.Ua") , new LocalizedText("Opc.Ua","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(33),NodeIdUtil.createNodeId(0,15) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2156) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionTimeoutCount") , new LocalizedText("SessionTimeoutCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(34),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2157) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionAbortCount") , new LocalizedText("SessionAbortCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(35),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7619) , NodeClass.valueOf(2) ,new QualifiedName(0,"NamespaceUri") , new LocalizedText("NamespaceUri","") , new LocalizedText("A URI that uniquely identifies the dictionary.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(36),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2159) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishingIntervalCount") , new LocalizedText("PublishingIntervalCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(37),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2160) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentSubscriptionCount") , new LocalizedText("CurrentSubscriptionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(38),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2161) , NodeClass.valueOf(2) ,new QualifiedName(0,"CumulatedSubscriptionCount") , new LocalizedText("CumulatedSubscriptionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(39),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2309, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15825, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15829, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15831, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15833, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15841, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15815) , NodeClass.valueOf(1) ,new QualifiedName(0,"Idle") , new LocalizedText("Idle","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2162) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityRejectedRequestsCount") , new LocalizedText("SecurityRejectedRequestsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(40),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2163) , NodeClass.valueOf(2) ,new QualifiedName(0,"RejectedRequestsCount") , new LocalizedText("RejectedRequestsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(41),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15825, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15827, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15835, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15817) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadPrepare") , new LocalizedText("ReadPrepare","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12779, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2164) , NodeClass.valueOf(16) ,new QualifiedName(0,"SamplingIntervalDiagnosticsArrayType") , new LocalizedText("SamplingIntervalDiagnosticsArrayType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,856) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11699, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2166, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11698, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11697, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2165) , NodeClass.valueOf(16) ,new QualifiedName(0,"SamplingIntervalDiagnosticsType") , new LocalizedText("SamplingIntervalDiagnosticsType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,856) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15827, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15829, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15837, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15819) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadTransfer") , new LocalizedText("ReadTransfer","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2165, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2166) , NodeClass.valueOf(2) ,new QualifiedName(0,"SamplingInterval") , new LocalizedText("SamplingInterval","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(42),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15831, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15833, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15839, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15821) , NodeClass.valueOf(1) ,new QualifiedName(0,"ApplyWrite") , new LocalizedText("ApplyWrite","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15835, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15837, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15839, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15841, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15823) , NodeClass.valueOf(1) ,new QualifiedName(0,"Error") , new LocalizedText("Error","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12784, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2171) , NodeClass.valueOf(16) ,new QualifiedName(0,"SubscriptionDiagnosticsArrayType") , new LocalizedText("SubscriptionDiagnosticsArrayType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,874) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15826, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15815, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15817, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15825) , NodeClass.valueOf(1) ,new QualifiedName(0,"IdleToReadPrepare") , new LocalizedText("IdleToReadPrepare","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8902, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2189, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2998, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8890, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2175, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2176, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2188, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8895, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2179, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2186, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2180, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2174, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8889, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8892, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2191, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8891, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2184, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2181, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8896, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2185, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8897, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2187, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2190, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8894, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2173, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8893, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2183, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2182, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8888, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2193, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2177, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2172) , NodeClass.valueOf(16) ,new QualifiedName(0,"SubscriptionDiagnosticsType") , new LocalizedText("SubscriptionDiagnosticsType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,874) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15825, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15826) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(43),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2173) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionId") , new LocalizedText("SessionId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(44),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15828, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15817, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15819, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15827) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadPrepareToReadTransfer") , new LocalizedText("ReadPrepareToReadTransfer","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add2(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2174) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubscriptionId") , new LocalizedText("SubscriptionId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(45),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15827, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15828) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(46),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2175) , NodeClass.valueOf(2) ,new QualifiedName(0,"Priority") , new LocalizedText("Priority","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(47),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15830, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15815, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15819, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15829) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadTransferToIdle") , new LocalizedText("ReadTransferToIdle","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2176) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishingInterval") , new LocalizedText("PublishingInterval","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(48),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",9906, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16776, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10522, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,10368) , NodeClass.valueOf(8) ,new QualifiedName(0,"NonExclusiveDeviationAlarmType") , new LocalizedText("NonExclusiveDeviationAlarmType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15829, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15830) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(49),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2177) , NodeClass.valueOf(2) ,new QualifiedName(0,"MaxKeepAliveCount") , new LocalizedText("MaxKeepAliveCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(50),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15832, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15815, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15821, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15831) , NodeClass.valueOf(1) ,new QualifiedName(0,"IdleToApplyWrite") , new LocalizedText("IdleToApplyWrite","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15831, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15832) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(51),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2179) , NodeClass.valueOf(2) ,new QualifiedName(0,"MaxNotificationsPerPublish") , new LocalizedText("MaxNotificationsPerPublish","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(52),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15834, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15815, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15821, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15833) , NodeClass.valueOf(1) ,new QualifiedName(0,"ApplyWriteToIdle") , new LocalizedText("ApplyWriteToIdle","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2180) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishingEnabled") , new LocalizedText("PublishingEnabled","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(53),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15833, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15834) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(54),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2181) , NodeClass.valueOf(2) ,new QualifiedName(0,"ModifyCount") , new LocalizedText("ModifyCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(55),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15836, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15817, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15823, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15835) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadPrepareToError") , new LocalizedText("ReadPrepareToError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2182) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnableCount") , new LocalizedText("EnableCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(56),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15835, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15836) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(57),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2183) , NodeClass.valueOf(2) ,new QualifiedName(0,"DisableCount") , new LocalizedText("DisableCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(58),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15838, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15819, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15823, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15837) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadTransferToError") , new LocalizedText("ReadTransferToError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2184) , NodeClass.valueOf(2) ,new QualifiedName(0,"RepublishRequestCount") , new LocalizedText("RepublishRequestCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(59),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15837, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15838) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(60),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2185) , NodeClass.valueOf(2) ,new QualifiedName(0,"RepublishMessageRequestCount") , new LocalizedText("RepublishMessageRequestCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(61),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15840, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15821, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15823, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15839) , NodeClass.valueOf(1) ,new QualifiedName(0,"ApplyWriteToError") , new LocalizedText("ApplyWriteToError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2186) , NodeClass.valueOf(2) ,new QualifiedName(0,"RepublishMessageCount") , new LocalizedText("RepublishMessageCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(62),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15839, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15840) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(63),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2187) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransferRequestCount") , new LocalizedText("TransferRequestCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(64),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15842, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15815, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15823, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15841) , NodeClass.valueOf(1) ,new QualifiedName(0,"ErrorToIdle") , new LocalizedText("ErrorToIdle","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2188) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransferredToAltClientCount") , new LocalizedText("TransferredToAltClientCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(65),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",298, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7650) , NodeClass.valueOf(2) ,new QualifiedName(0,"Argument") , new LocalizedText("Argument","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(66),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15841, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15842) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(67),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2189) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransferredToSameClientCount") , new LocalizedText("TransferredToSameClientCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(68),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15803, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15843) , NodeClass.valueOf(4) ,new QualifiedName(0,"Reset") , new LocalizedText("Reset","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2190) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishRequestCount") , new LocalizedText("PublishRequestCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(69),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14643, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15845, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15844) , NodeClass.valueOf(1) ,new QualifiedName(0,"Status") , new LocalizedText("Status","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2191) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataChangeNotificationsCount") , new LocalizedText("DataChangeNotificationsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(70),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15844, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15845) , NodeClass.valueOf(2) ,new QualifiedName(0,"State") , new LocalizedText("State","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,14647) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2193) , NodeClass.valueOf(2) ,new QualifiedName(0,"NotificationsCount") , new LocalizedText("NotificationsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(71),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8251, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7656) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumValueType") , new LocalizedText("EnumValueType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(72),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12816, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2196) , NodeClass.valueOf(16) ,new QualifiedName(0,"SessionDiagnosticsArrayType") , new LocalizedText("SessionDiagnosticsArrayType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,865) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11892, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2731, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2234, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2206, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2226, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2199, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2241, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2221, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2231, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2730, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2209, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2237, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2225, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2198, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2223, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2222, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2235, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2229, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2236, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2205, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2233, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3050, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2207, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2217, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2203, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2204, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2227, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2238, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2224, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2202, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2200, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2242, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8900, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2218, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2230, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2219, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2220, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2228, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2240, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2201, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2208, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2197) , NodeClass.valueOf(16) ,new QualifiedName(0,"SessionDiagnosticsVariableType") , new LocalizedText("SessionDiagnosticsVariableType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,865) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",301, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7659) , NodeClass.valueOf(2) ,new QualifiedName(0,"StatusResult") , new LocalizedText("StatusResult","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(73),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2198) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionId") , new LocalizedText("SessionId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(74),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2199) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionName") , new LocalizedText("SessionName","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2200) , NodeClass.valueOf(2) ,new QualifiedName(0,"ClientDescription") , new LocalizedText("ClientDescription","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,308) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",306, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7662) , NodeClass.valueOf(2) ,new QualifiedName(0,"UserTokenPolicy") , new LocalizedText("UserTokenPolicy","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(75),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15693, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15854) , NodeClass.valueOf(2) ,new QualifiedName(0,"WriterGroupMessageDataType") , new LocalizedText("WriterGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(76),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2201) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerUri") , new LocalizedText("ServerUri","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2202) , NodeClass.valueOf(2) ,new QualifiedName(0,"EndpointUrl") , new LocalizedText("EndpointUrl","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2203) , NodeClass.valueOf(2) ,new QualifiedName(0,"LocaleIds") , new LocalizedText("LocaleIds","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,295) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15694, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15857) , NodeClass.valueOf(2) ,new QualifiedName(0,"PubSubConnectionDataType") , new LocalizedText("PubSubConnectionDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(77),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",310, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7665) , NodeClass.valueOf(2) ,new QualifiedName(0,"ApplicationDescription") , new LocalizedText("ApplicationDescription","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(78),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2204) , NodeClass.valueOf(2) ,new QualifiedName(0,"ActualSessionTimeout") , new LocalizedText("ActualSessionTimeout","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(79),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2205) , NodeClass.valueOf(2) ,new QualifiedName(0,"ClientConnectionTime") , new LocalizedText("ClientConnectionTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(80),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2206) , NodeClass.valueOf(2) ,new QualifiedName(0,"ClientLastContactTime") , new LocalizedText("ClientLastContactTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(81),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add3(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15695, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15860) , NodeClass.valueOf(2) ,new QualifiedName(0,"ConnectionTransportDataType") , new LocalizedText("ConnectionTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(82),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",314, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7668) , NodeClass.valueOf(2) ,new QualifiedName(0,"EndpointDescription") , new LocalizedText("EndpointDescription","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(83),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2207) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentSubscriptionsCount") , new LocalizedText("CurrentSubscriptionsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(84),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2208) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentMonitoredItemsCount") , new LocalizedText("CurrentMonitoredItemsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(85),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2209) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentPublishRequestsInQueue") , new LocalizedText("CurrentPublishRequestsInQueue","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(86),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",318, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7671) , NodeClass.valueOf(2) ,new QualifiedName(0,"UserIdentityToken") , new LocalizedText("UserIdentityToken","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(87),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15701, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15866) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReaderGroupTransportDataType") , new LocalizedText("ReaderGroupTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(88),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",321, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7674) , NodeClass.valueOf(2) ,new QualifiedName(0,"AnonymousIdentityToken") , new LocalizedText("AnonymousIdentityToken","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(89),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15702, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15869) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReaderGroupMessageDataType") , new LocalizedText("ReaderGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(90),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",324, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7677) , NodeClass.valueOf(2) ,new QualifiedName(0,"UserNameIdentityToken") , new LocalizedText("UserNameIdentityToken","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(91),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2217) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReadCount") , new LocalizedText("ReadCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2218) , NodeClass.valueOf(2) ,new QualifiedName(0,"HistoryReadCount") , new LocalizedText("HistoryReadCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15703, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15872) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetReaderDataType") , new LocalizedText("DataSetReaderDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(92),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",327, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7680) , NodeClass.valueOf(2) ,new QualifiedName(0,"X509IdentityToken") , new LocalizedText("X509IdentityToken","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(93),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2219) , NodeClass.valueOf(2) ,new QualifiedName(0,"WriteCount") , new LocalizedText("WriteCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2220) , NodeClass.valueOf(2) ,new QualifiedName(0,"HistoryUpdateCount") , new LocalizedText("HistoryUpdateCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",29, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15875, nsTable)));
nodes2add.add(new UADataTypeNode(NodeIdUtil.createNodeId(0,15874) , NodeClass.valueOf(64) ,new QualifiedName(0,"OverrideValueHandling") , new LocalizedText("OverrideValueHandling","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2221) , NodeClass.valueOf(2) ,new QualifiedName(0,"CallCount") , new LocalizedText("CallCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",940, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7683) , NodeClass.valueOf(2) ,new QualifiedName(0,"IssuedIdentityToken") , new LocalizedText("IssuedIdentityToken","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(94),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15874, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15875) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(95),NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2222) , NodeClass.valueOf(2) ,new QualifiedName(0,"CreateMonitoredItemsCount") , new LocalizedText("CreateMonitoredItemsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2223) , NodeClass.valueOf(2) ,new QualifiedName(0,"ModifyMonitoredItemsCount") , new LocalizedText("ModifyMonitoredItemsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15705, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15877) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetReaderTransportDataType") , new LocalizedText("DataSetReaderTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(96),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2224) , NodeClass.valueOf(2) ,new QualifiedName(0,"SetMonitoringModeCount") , new LocalizedText("SetMonitoringModeCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",333, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7686) , NodeClass.valueOf(2) ,new QualifiedName(0,"EndpointConfiguration") , new LocalizedText("EndpointConfiguration","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(97),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2225) , NodeClass.valueOf(2) ,new QualifiedName(0,"SetTriggeringCount") , new LocalizedText("SetTriggeringCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2226) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteMonitoredItemsCount") , new LocalizedText("DeleteMonitoredItemsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15706, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15880) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetReaderMessageDataType") , new LocalizedText("DataSetReaderMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(98),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2227) , NodeClass.valueOf(2) ,new QualifiedName(0,"CreateSubscriptionCount") , new LocalizedText("CreateSubscriptionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2228) , NodeClass.valueOf(2) ,new QualifiedName(0,"ModifySubscriptionCount") , new LocalizedText("ModifySubscriptionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2229) , NodeClass.valueOf(2) ,new QualifiedName(0,"SetPublishingModeCount") , new LocalizedText("SetPublishingModeCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15707, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15883) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubscribedDataSetDataType") , new LocalizedText("SubscribedDataSetDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(99),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2230) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishCount") , new LocalizedText("PublishCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",340, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7692) , NodeClass.valueOf(2) ,new QualifiedName(0,"BuildInfo") , new LocalizedText("BuildInfo","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(100),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2231) , NodeClass.valueOf(2) ,new QualifiedName(0,"RepublishCount") , new LocalizedText("RepublishCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2232) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransferSubscriptionsCount") , new LocalizedText("TransferSubscriptionsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15712, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15886) , NodeClass.valueOf(2) ,new QualifiedName(0,"TargetVariablesDataType") , new LocalizedText("TargetVariablesDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(101),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2233) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteSubscriptionsCount") , new LocalizedText("DeleteSubscriptionsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2234) , NodeClass.valueOf(2) ,new QualifiedName(0,"AddNodesCount") , new LocalizedText("AddNodesCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2235) , NodeClass.valueOf(2) ,new QualifiedName(0,"AddReferencesCount") , new LocalizedText("AddReferencesCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15713, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15889) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubscribedDataSetMirrorDataType") , new LocalizedText("SubscribedDataSetMirrorDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(102),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2236) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteNodesCount") , new LocalizedText("DeleteNodesCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",346, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7698) , NodeClass.valueOf(2) ,new QualifiedName(0,"SignedSoftwareCertificate") , new LocalizedText("SignedSoftwareCertificate","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(103),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2237) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteReferencesCount") , new LocalizedText("DeleteReferencesCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2238) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrowseCount") , new LocalizedText("BrowseCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2239) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrowseNextCount") , new LocalizedText("BrowseNextCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2240) , NodeClass.valueOf(2) ,new QualifiedName(0,"TranslateBrowsePathsToNodeIdsCount") , new LocalizedText("TranslateBrowsePathsToNodeIdsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2241) , NodeClass.valueOf(2) ,new QualifiedName(0,"QueryFirstCount") , new LocalizedText("QueryFirstCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15715, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15895) , NodeClass.valueOf(2) ,new QualifiedName(0,"UadpWriterGroupMessageDataType") , new LocalizedText("UadpWriterGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(104),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2242) , NodeClass.valueOf(2) ,new QualifiedName(0,"QueryNextCount") , new LocalizedText("QueryNextCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12860, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2243) , NodeClass.valueOf(16) ,new QualifiedName(0,"SessionSecurityDiagnosticsArrayType") , new LocalizedText("SessionSecurityDiagnosticsArrayType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,868) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2248, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3058, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2246, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2245, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2251, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2250, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2247, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2249, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2252, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2244) , NodeClass.valueOf(16) ,new QualifiedName(0,"SessionSecurityDiagnosticsType") , new LocalizedText("SessionSecurityDiagnosticsType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,868) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15717, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15898) , NodeClass.valueOf(2) ,new QualifiedName(0,"UadpDataSetWriterMessageDataType") , new LocalizedText("UadpDataSetWriterMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(105),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2245) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionId") , new LocalizedText("SessionId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(106),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2246) , NodeClass.valueOf(2) ,new QualifiedName(0,"ClientUserIdOfSession") , new LocalizedText("ClientUserIdOfSession","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2247) , NodeClass.valueOf(2) ,new QualifiedName(0,"ClientUserIdHistory") , new LocalizedText("ClientUserIdHistory","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2248) , NodeClass.valueOf(2) ,new QualifiedName(0,"AuthenticationMechanism") , new LocalizedText("AuthenticationMechanism","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2249) , NodeClass.valueOf(2) ,new QualifiedName(0,"Encoding") , new LocalizedText("Encoding","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2250) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransportProtocol") , new LocalizedText("TransportProtocol","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",5, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15577, nsTable)));
nodes2add.add(new UADataTypeNode(NodeIdUtil.createNodeId(0,15904) , NodeClass.valueOf(64) ,new QualifiedName(0,"DataSetFieldFlags") , new LocalizedText("DataSetFieldFlags","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2251) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityMode") , new LocalizedText("SecurityMode","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,302) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2252) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityPolicyUri") , new LocalizedText("SecurityPolicyUri","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15913, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15907, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15910, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14416, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,15906) , NodeClass.valueOf(8) ,new QualifiedName(0,"PubSubKeyServiceType") , new LocalizedText("PubSubKeyServiceType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add4(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2004, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2255, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12885, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14443, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2268, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2994, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2267, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2295, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2254, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12749, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12637, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17634, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12886, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11492, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2296, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12873, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2253) , NodeClass.valueOf(1) ,new QualifiedName(0,"Server") , new LocalizedText("Server","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(1)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15906, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15908, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15909, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15907) , NodeClass.valueOf(4) ,new QualifiedName(0,"GetSecurityKeys") , new LocalizedText("GetSecurityKeys","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2254) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerArray") , new LocalizedText("ServerArray","") , new LocalizedText("The list of server URIs used by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(107),NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15907, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15908) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(108),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2255) , NodeClass.valueOf(2) ,new QualifiedName(0,"NamespaceArray") , new LocalizedText("NamespaceArray","") , new LocalizedText("The list of namespace URIs used by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(109),NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15907, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15909) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(109),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2138, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2257, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2993, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2259, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2258, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2992, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2256) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerStatus") , new LocalizedText("ServerStatus","") , new LocalizedText("The current status of the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,862) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15906, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15912, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15911, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15910) , NodeClass.valueOf(4) ,new QualifiedName(0,"GetSecurityGroup") , new LocalizedText("GetSecurityGroup","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2257) , NodeClass.valueOf(2) ,new QualifiedName(0,"StartTime") , new LocalizedText("StartTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(110),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15910, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15911) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(111),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2258) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentTime") , new LocalizedText("CurrentTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(112),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15910, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15912) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(113),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2259) , NodeClass.valueOf(2) ,new QualifiedName(0,"State") , new LocalizedText("State","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,852) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15906, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15452, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15917, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15914, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15913) , NodeClass.valueOf(1) ,new QualifiedName(0,"SecurityGroups") , new LocalizedText("SecurityGroups","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3051, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2265, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2263, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2262, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2266, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2261, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2260) , NodeClass.valueOf(2) ,new QualifiedName(0,"BuildInfo") , new LocalizedText("BuildInfo","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,338) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15913, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15915, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15916, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15914) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddSecurityGroup") , new LocalizedText("AddSecurityGroup","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2261) , NodeClass.valueOf(2) ,new QualifiedName(0,"ProductName") , new LocalizedText("ProductName","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15914, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15915) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(114),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2262) , NodeClass.valueOf(2) ,new QualifiedName(0,"ProductUri") , new LocalizedText("ProductUri","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15914, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15916) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(115),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2263) , NodeClass.valueOf(2) ,new QualifiedName(0,"ManufacturerName") , new LocalizedText("ManufacturerName","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15913, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15918, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15917) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveSecurityGroup") , new LocalizedText("RemoveSecurityGroup","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2264) , NodeClass.valueOf(2) ,new QualifiedName(0,"SoftwareVersion") , new LocalizedText("SoftwareVersion","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15917, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15918) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(116),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2265) , NodeClass.valueOf(2) ,new QualifiedName(0,"BuildNumber") , new LocalizedText("BuildNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15718, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15919) , NodeClass.valueOf(2) ,new QualifiedName(0,"UadpDataSetReaderMessageDataType") , new LocalizedText("UadpDataSetReaderMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(117),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2266) , NodeClass.valueOf(2) ,new QualifiedName(0,"BuildDate") , new LocalizedText("BuildDate","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(118),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",378, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7728) , NodeClass.valueOf(2) ,new QualifiedName(0,"AddNodesItem") , new LocalizedText("AddNodesItem","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(119),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2267) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServiceLevel") , new LocalizedText("ServiceLevel","") , new LocalizedText("A value indicating the level of service the server can provide. 255 indicates the best.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(120),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2013, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2272, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15606, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11702, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2997, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2735, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2269, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12911, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2737, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2271, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11192, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2736, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11703, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2996, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2268) , NodeClass.valueOf(1) ,new QualifiedName(0,"ServerCapabilities") , new LocalizedText("ServerCapabilities","") , new LocalizedText("Describes capabilities supported by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15719, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15922) , NodeClass.valueOf(2) ,new QualifiedName(0,"JsonWriterGroupMessageDataType") , new LocalizedText("JsonWriterGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(121),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2268, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2269) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerProfileArray") , new LocalizedText("ServerProfileArray","") , new LocalizedText("A list of profiles supported by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",381, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7731) , NodeClass.valueOf(2) ,new QualifiedName(0,"AddReferencesItem") , new LocalizedText("AddReferencesItem","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(122),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2268, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2271) , NodeClass.valueOf(2) ,new QualifiedName(0,"LocaleIdArray") , new LocalizedText("LocaleIdArray","") , new LocalizedText("A list of locales supported by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,295) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15724, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15925) , NodeClass.valueOf(2) ,new QualifiedName(0,"JsonDataSetWriterMessageDataType") , new LocalizedText("JsonDataSetWriterMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(123),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2268, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2272) , NodeClass.valueOf(2) ,new QualifiedName(0,"MinSupportedSampleRate") , new LocalizedText("MinSupportedSampleRate","") , new LocalizedText("The minimum sampling interval supported by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(124),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15926) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityMode") , new LocalizedText("SecurityMode","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,302) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",384, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7734) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteNodesItem") , new LocalizedText("DeleteNodesItem","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(125),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15927) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityGroupId") , new LocalizedText("SecurityGroupId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2020, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2289, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3706, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2290, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2294, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2274) , NodeClass.valueOf(1) ,new QualifiedName(0,"ServerDiagnostics") , new LocalizedText("ServerDiagnostics","") , new LocalizedText("Reports diagnostics about the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15928) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityKeyServices") , new LocalizedText("SecurityKeyServices","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,312) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2150, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2281, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2288, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2282, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2276, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2279, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2277, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2286, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3705, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2285, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2284, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2278, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2275) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerDiagnosticsSummary") , new LocalizedText("ServerDiagnosticsSummary","") , new LocalizedText("A summary of server level diagnostics.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,859) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",387, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7737) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteReferencesItem") , new LocalizedText("DeleteReferencesItem","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(126),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2276) , NodeClass.valueOf(2) ,new QualifiedName(0,"ServerViewCount") , new LocalizedText("ServerViewCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(127),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2277) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentSessionCount") , new LocalizedText("CurrentSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(128),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15725, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15931) , NodeClass.valueOf(2) ,new QualifiedName(0,"JsonDataSetReaderMessageDataType") , new LocalizedText("JsonDataSetReaderMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(129),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2278) , NodeClass.valueOf(2) ,new QualifiedName(0,"CumulatedSessionCount") , new LocalizedText("CumulatedSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(130),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15306, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15932) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityMode") , new LocalizedText("SecurityMode","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,302) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2279) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityRejectedSessionCount") , new LocalizedText("SecurityRejectedSessionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(131),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15306, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15933) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityGroupId") , new LocalizedText("SecurityGroupId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15306, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15934) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityKeyServices") , new LocalizedText("SecurityKeyServices","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,312) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2281) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionTimeoutCount") , new LocalizedText("SessionTimeoutCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(132),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11163, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,18665) , NodeClass.valueOf(8) ,new QualifiedName(0,"StatisticalConditionClassType") , new LocalizedText("StatisticalConditionClassType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2282) , NodeClass.valueOf(2) ,new QualifiedName(0,"SessionAbortCount") , new LocalizedText("SessionAbortCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(133),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17279, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,3065) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2127, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,18666) , NodeClass.valueOf(4) ,new QualifiedName(0,"Reset") , new LocalizedText("Reset","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2284) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishingIntervalCount") , new LocalizedText("PublishingIntervalCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(134),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2285) , NodeClass.valueOf(2) ,new QualifiedName(0,"CurrentSubscriptionCount") , new LocalizedText("CurrentSubscriptionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(135),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2286) , NodeClass.valueOf(2) ,new QualifiedName(0,"CumulatedSubscriptionCount") , new LocalizedText("CumulatedSubscriptionCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(136),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15727, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15940) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrokerWriterGroupTransportDataType") , new LocalizedText("BrokerWriterGroupTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(137),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add5(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2287) , NodeClass.valueOf(2) ,new QualifiedName(0,"SecurityRejectedRequestsCount") , new LocalizedText("SecurityRejectedRequestsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(138),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2288) , NodeClass.valueOf(2) ,new QualifiedName(0,"RejectedRequestsCount") , new LocalizedText("RejectedRequestsCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(139),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2164, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2289) , NodeClass.valueOf(2) ,new QualifiedName(0,"SamplingIntervalDiagnosticsArray") , new LocalizedText("SamplingIntervalDiagnosticsArray","") , new LocalizedText("A list of diagnostics for each sampling interval supported by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,856) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15729, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15943) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrokerDataSetWriterTransportDataType") , new LocalizedText("BrokerDataSetWriterTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(140),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2171, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2290) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubscriptionDiagnosticsArray") , new LocalizedText("SubscriptionDiagnosticsArray","") , new LocalizedText("A list of diagnostics for each active subscription.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,874) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15733, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15946) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrokerDataSetReaderTransportDataType") , new LocalizedText("BrokerDataSetReaderTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(141),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2294) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnabledFlag") , new LocalizedText("EnabledFlag","") , new LocalizedText("If TRUE the diagnostics collection is enabled.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(142),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2033, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2295) , NodeClass.valueOf(1) ,new QualifiedName(0,"VendorServerInfo") , new LocalizedText("VendorServerInfo","") , new LocalizedText("Server information provided by the vendor.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15528, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16024, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15949) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2034, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11313, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11314, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14415, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11312, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3709, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2296) , NodeClass.valueOf(1) ,new QualifiedName(0,"ServerRedundancy") , new LocalizedText("ServerRedundancy","") , new LocalizedText("Describes the redundancy capabilities of the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15534, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16027, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15950) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15578, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16030, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15951) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15580, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16033, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15952) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2770, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2769, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2771, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2299) , NodeClass.valueOf(8) ,new QualifiedName(0,"StateMachineType") , new LocalizedText("StateMachineType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15581, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16037, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15953) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15582, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16040, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15954) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15597, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16047, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15955) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11753, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14900, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13325, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13326, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13327, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,13225) , NodeClass.valueOf(8) ,new QualifiedName(0,"CertificateExpirationAlarmType") , new LocalizedText("CertificateExpirationAlarmType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15598, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16050, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15956) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15964, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16135, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15963, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16134, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15960, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15962, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15961, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15959, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15958, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16136, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15957) , NodeClass.valueOf(1) ,new QualifiedName(0,"http://opcfoundation.org/UA/") , new LocalizedText("http://opcfoundation.org/UA/","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15958) , NodeClass.valueOf(2) ,new QualifiedName(0,"NamespaceUri") , new LocalizedText("NamespaceUri","") , new LocalizedText("The URI of the namespace.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(143),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15959) , NodeClass.valueOf(2) ,new QualifiedName(0,"NamespaceVersion") , new LocalizedText("NamespaceVersion","") , new LocalizedText("The human readable string representing version of the namespace.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(144),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15960) , NodeClass.valueOf(2) ,new QualifiedName(0,"NamespacePublicationDate") , new LocalizedText("NamespacePublicationDate","") , new LocalizedText("The publication date for the namespace.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(145),NodeIdUtil.createNodeId(0,13) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15109, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2308, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2309, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2307) , NodeClass.valueOf(8) ,new QualifiedName(0,"StateType") , new LocalizedText("StateType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15961) , NodeClass.valueOf(2) ,new QualifiedName(0,"IsNamespaceSubset") , new LocalizedText("IsNamespaceSubset","") , new LocalizedText("If TRUE then the server only supports a subset of the namespace.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(146),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2308) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateNumber") , new LocalizedText("StateNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(147),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15962) , NodeClass.valueOf(2) ,new QualifiedName(0,"StaticNodeIdTypes") , new LocalizedText("StaticNodeIdTypes","") , new LocalizedText("A list of IdTypes for nodes which are the same in every server that exposes them.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,256) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2309) , NodeClass.valueOf(8) ,new QualifiedName(0,"InitialStateType") , new LocalizedText("InitialStateType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15963) , NodeClass.valueOf(2) ,new QualifiedName(0,"StaticNumericNodeIdRange") , new LocalizedText("StaticNumericNodeIdRange","") , new LocalizedText("A list of ranges for numeric node ids which are the same in every server that exposes them.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,291) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2312, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2310) , NodeClass.valueOf(8) ,new QualifiedName(0,"TransitionType") , new LocalizedText("TransitionType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15964) , NodeClass.valueOf(2) ,new QualifiedName(0,"StaticStringNodeIdPattern") , new LocalizedText("StaticStringNodeIdPattern","") , new LocalizedText("A regular expression which matches string node ids are the same in every server that exposes them.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2041, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2774, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2775, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2776, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15825, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15827, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15829, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15831, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15833, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15835, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15837, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15839, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15841, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2311) , NodeClass.valueOf(8) ,new QualifiedName(0,"TransitionEventType") , new LocalizedText("TransitionEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2312) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(148),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2127, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2777, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11856, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2778, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3806, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2315) , NodeClass.valueOf(8) ,new QualifiedName(0,"AuditUpdateStateEventType") , new LocalizedText("AuditUpdateStateEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2323, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2324, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11500, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2325, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11499, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11876, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2328, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2326, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2327, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3059, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2318) , NodeClass.valueOf(8) ,new QualifiedName(0,"HistoricalDataConfigurationType") , new LocalizedText("HistoricalDataConfigurationType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",434, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7782) , NodeClass.valueOf(2) ,new QualifiedName(0,"RegisteredServer") , new LocalizedText("RegisteredServer","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(149),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2323) , NodeClass.valueOf(2) ,new QualifiedName(0,"Stepped") , new LocalizedText("Stepped","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(150),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2324) , NodeClass.valueOf(2) ,new QualifiedName(0,"Definition") , new LocalizedText("Definition","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2325) , NodeClass.valueOf(2) ,new QualifiedName(0,"MaxTimeInterval") , new LocalizedText("MaxTimeInterval","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(151),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2326) , NodeClass.valueOf(2) ,new QualifiedName(0,"MinTimeInterval") , new LocalizedText("MinTimeInterval","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(152),NodeIdUtil.createNodeId(0,290) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2327) , NodeClass.valueOf(2) ,new QualifiedName(0,"ExceptionDeviation") , new LocalizedText("ExceptionDeviation","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(153),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2328) , NodeClass.valueOf(2) ,new QualifiedName(0,"ExceptionDeviationFormat") , new LocalizedText("ExceptionDeviationFormat","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,890) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11501, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2337, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11269, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11280, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11270, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2338, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2331, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11172, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11278, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2335, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2332, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11279, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2334, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2336, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11268, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2330) , NodeClass.valueOf(8) ,new QualifiedName(0,"HistoryServerCapabilitiesType") , new LocalizedText("HistoryServerCapabilitiesType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10368, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,10522) , NodeClass.valueOf(2) ,new QualifiedName(0,"SetpointNode") , new LocalizedText("SetpointNode","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(154),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2331) , NodeClass.valueOf(2) ,new QualifiedName(0,"AccessHistoryDataCapability") , new LocalizedText("AccessHistoryDataCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(155),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",14416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19732, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18760, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18728, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18727, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18722, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18717, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,18715) , NodeClass.valueOf(1) ,new QualifiedName(0,"Diagnostics") , new LocalizedText("Diagnostics","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2915, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10637, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,10523) , NodeClass.valueOf(8) ,new QualifiedName(0,"DiscreteAlarmType") , new LocalizedText("DiscreteAlarmType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2332) , NodeClass.valueOf(2) ,new QualifiedName(0,"AccessHistoryEventsCapability") , new LocalizedText("AccessHistoryEventsCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(156),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18716) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18718, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18720, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18719, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18717) , NodeClass.valueOf(2) ,new QualifiedName(0,"TotalInformation") , new LocalizedText("TotalInformation","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(157),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15605, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16053, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15987) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2334) , NodeClass.valueOf(2) ,new QualifiedName(0,"InsertDataCapability") , new LocalizedText("InsertDataCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(158),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18717, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18718) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(159),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15609, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16056, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15988) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2335) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReplaceDataCapability") , new LocalizedText("ReplaceDataCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(160),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18717, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18719) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2336) , NodeClass.valueOf(2) ,new QualifiedName(0,"UpdateDataCapability") , new LocalizedText("UpdateDataCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(161),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18717, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18720) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15611, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16062, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15990) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add6(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2337) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteRawCapability") , new LocalizedText("DeleteRawCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(162),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16065, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15991) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2338) , NodeClass.valueOf(2) ,new QualifiedName(0,"DeleteAtTimeCapability") , new LocalizedText("DeleteAtTimeCapability","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(163),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18723, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18724, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18722) , NodeClass.valueOf(2) ,new QualifiedName(0,"TotalError") , new LocalizedText("TotalError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(164),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16068, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15992) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18722, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18723) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(165),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15618, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16071, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15993) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2340) , NodeClass.valueOf(8) ,new QualifiedName(0,"AggregateFunctionType") , new LocalizedText("AggregateFunctionType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18722, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18724) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2341) , NodeClass.valueOf(1) ,new QualifiedName(0,"Interpolative") , new LocalizedText("Interpolative","") , new LocalizedText("At the beginning of each interval, retrieve the calculated value from the data points on either side of the requested timestamp.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18722, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18725) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15621, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16077, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15995) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2342) , NodeClass.valueOf(1) ,new QualifiedName(0,"Average") , new LocalizedText("Average","") , new LocalizedText("Retrieve the average value of the data over the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15622, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16080, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,15996) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2343) , NodeClass.valueOf(1) ,new QualifiedName(0,"TimeAverage") , new LocalizedText("TimeAverage","") , new LocalizedText("Retrieve the time weighted average data over the interval using Interpolated Bounding Values.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,18727) , NodeClass.valueOf(4) ,new QualifiedName(0,"Reset") , new LocalizedText("Reset","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15607, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15999, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15998, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,15997) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddRole") , new LocalizedText("AddRole","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2344) , NodeClass.valueOf(1) ,new QualifiedName(0,"Total") , new LocalizedText("Total","") , new LocalizedText("Retrieve the total (time integral) of the data over the interval using Interpolated Bounding Values.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18728) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubError") , new LocalizedText("SubError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(166),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15997, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15998) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(167),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18735, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18740, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18745, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18750, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18730, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18755, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,18729) , NodeClass.valueOf(1) ,new QualifiedName(0,"Counters") , new LocalizedText("Counters","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15997, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,15999) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(168),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2346) , NodeClass.valueOf(1) ,new QualifiedName(0,"Minimum") , new LocalizedText("Minimum","") , new LocalizedText("Retrieve the minimum raw value in the interval with the timestamp of the start of the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18733, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18732, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18731, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18730) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateError") , new LocalizedText("StateError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(169),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15607, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16001, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16000) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveRole") , new LocalizedText("RemoveRole","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2347) , NodeClass.valueOf(1) ,new QualifiedName(0,"Maximum") , new LocalizedText("Maximum","") , new LocalizedText("Retrieve the maximum raw value in the interval with the timestamp of the start of the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18730, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18731) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(170),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16000, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16001) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(171),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2348) , NodeClass.valueOf(1) ,new QualifiedName(0,"MinimumActualTime") , new LocalizedText("MinimumActualTime","") , new LocalizedText("Retrieve the minimum value in the interval and the Timestamp of the minimum value.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18730, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18732) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(172),NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2349) , NodeClass.valueOf(1) ,new QualifiedName(0,"MaximumActualTime") , new LocalizedText("MaximumActualTime","") , new LocalizedText("Retrieve the maximum value in the interval and the Timestamp of the maximum value.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18730, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18733) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(173),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2350) , NodeClass.valueOf(1) ,new QualifiedName(0,"Range") , new LocalizedText("Range","") , new LocalizedText("Retrieve the difference between the minimum and maximum Value over the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2351) , NodeClass.valueOf(1) ,new QualifiedName(0,"AnnotationCount") , new LocalizedText("AnnotationCount","") , new LocalizedText("Retrieve the number of Annotations in the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18738, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18736, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18737, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18735) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateOperationalByMethod") , new LocalizedText("StateOperationalByMethod","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(174),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2352) , NodeClass.valueOf(1) ,new QualifiedName(0,"Count") , new LocalizedText("Count","") , new LocalizedText("Retrieve the number of raw values over the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18735, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18736) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(175),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18735, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18737) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(176),NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15623, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16083, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16007) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18735, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18738) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(177),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15628, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16086, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16008) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2355) , NodeClass.valueOf(1) ,new QualifiedName(0,"NumberOfTransitions") , new LocalizedText("NumberOfTransitions","") , new LocalizedText("Retrieve the number of changes between zero and non-zero that a Boolean or Numeric value experienced in the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15629, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16089, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16009) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18741, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18742, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18743, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18740) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateOperationalByParent") , new LocalizedText("StateOperationalByParent","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(178),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15630, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16092, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16010) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2357) , NodeClass.valueOf(1) ,new QualifiedName(0,"Start") , new LocalizedText("Start","") , new LocalizedText("Retrieve the value at the beginning of the interval using Interpolated Bounding Values.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18740, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18741) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(179),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15631, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16095, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16011) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2358) , NodeClass.valueOf(1) ,new QualifiedName(0,"End") , new LocalizedText("End","") , new LocalizedText("Retrieve the value at the end of the interval using Interpolated Bounding Values.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18740, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18742) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(180),NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15635, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16098, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16012) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2359) , NodeClass.valueOf(1) ,new QualifiedName(0,"Delta") , new LocalizedText("Delta","") , new LocalizedText("Retrieve the difference between the Start and End value in the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18740, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18743) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(181),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2360) , NodeClass.valueOf(1) ,new QualifiedName(0,"DurationGood") , new LocalizedText("DurationGood","") , new LocalizedText("Retrieve the total duration of time in the interval during which the data is good.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15645, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16104, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16014) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2361) , NodeClass.valueOf(1) ,new QualifiedName(0,"DurationBad") , new LocalizedText("DurationBad","") , new LocalizedText("Retrieve the total duration of time in the interval during which the data is bad.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18748, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18746, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18747, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18745) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateOperationalFromError") , new LocalizedText("StateOperationalFromError","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(182),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15652, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16107, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16015) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2362) , NodeClass.valueOf(1) ,new QualifiedName(0,"PercentGood") , new LocalizedText("PercentGood","") , new LocalizedText("Retrieve the percent of data (0 to 100) in the interval which has a good StatusCode.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18745, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18746) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(183),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15653, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16110, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16016) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2363) , NodeClass.valueOf(1) ,new QualifiedName(0,"PercentBad") , new LocalizedText("PercentBad","") , new LocalizedText("Retrieve the percent of data (0 to 100) in the interval which has a bad StatusCode.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18745, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18747) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(184),NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15657, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16113, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16017) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2340, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2364) , NodeClass.valueOf(1) ,new QualifiedName(0,"WorstQuality") , new LocalizedText("WorstQuality","") , new LocalizedText("Retrieve the worst StatusCode of data in the interval.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18745, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18748) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(185),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15664, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16116, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16018) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12021, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2367, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2366, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2365) , NodeClass.valueOf(16) ,new QualifiedName(0,"DataItemType") , new LocalizedText("DataItemType","") , new LocalizedText("A variable that contains live automation data.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-2,new UnsignedInteger[0],false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15665, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16119, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16019) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2365, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2366) , NodeClass.valueOf(2) ,new QualifiedName(0,"Definition") , new LocalizedText("Definition","") , new LocalizedText("A vendor-specific, human readable string that specifies how the value of this DataItem is calculated.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18751, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18753, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18752, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18750) , NodeClass.valueOf(2) ,new QualifiedName(0,"StatePausedByParent") , new LocalizedText("StatePausedByParent","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(186),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add7(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2365, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2367) , NodeClass.valueOf(2) ,new QualifiedName(0,"ValuePrecision") , new LocalizedText("ValuePrecision","") , new LocalizedText("The maximum precision that the server can maintain for the item based on restrictions in the target environment.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(187),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18750, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18751) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(188),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15667, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16125, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16021) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2369, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17570, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2368) , NodeClass.valueOf(16) ,new QualifiedName(0,"AnalogItemType") , new LocalizedText("AnalogItemType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,26) ,-2,new UnsignedInteger[0],false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18750, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18752) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(189),NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15669, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16144, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16022) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2368, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2369) , NodeClass.valueOf(2) ,new QualifiedName(0,"EURange") , new LocalizedText("EURange","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,884) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18750, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18753) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(190),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15670, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16147, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16023) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15949, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16024) , NodeClass.valueOf(2) ,new QualifiedName(0,"EndpointType") , new LocalizedText("EndpointType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(191),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18729, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",19725, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18757, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18758, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18756, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18755) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateDisabledByMethod") , new LocalizedText("StateDisabledByMethod","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(192),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2365, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2373, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11238, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2376, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2372) , NodeClass.valueOf(16) ,new QualifiedName(0,"DiscreteItemType") , new LocalizedText("DiscreteItemType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-2,new UnsignedInteger[0],true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18755, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18756) , NodeClass.valueOf(2) ,new QualifiedName(0,"Active") , new LocalizedText("Active","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(193),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2374, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2375, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2373) , NodeClass.valueOf(16) ,new QualifiedName(0,"TwoStateDiscreteType") , new LocalizedText("TwoStateDiscreteType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,1) ,-2,new UnsignedInteger[0],false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18755, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18757) , NodeClass.valueOf(2) ,new QualifiedName(0,"Classification") , new LocalizedText("Classification","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(194),NodeIdUtil.createNodeId(0,19730) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15950, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16027) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataTypeSchemaHeader") , new LocalizedText("DataTypeSchemaHeader","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(195),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2373, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2374) , NodeClass.valueOf(2) ,new QualifiedName(0,"FalseState") , new LocalizedText("FalseState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18755, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18758) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(196),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2373, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2375) , NodeClass.valueOf(2) ,new QualifiedName(0,"TrueState") , new LocalizedText("TrueState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2377, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2376) , NodeClass.valueOf(16) ,new QualifiedName(0,"MultiStateDiscreteType") , new LocalizedText("MultiStateDiscreteType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,28) ,-2,new UnsignedInteger[0],false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18715, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",58, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18767, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18765, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18763, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18761, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,18760) , NodeClass.valueOf(1) ,new QualifiedName(0,"LiveValues") , new LocalizedText("LiveValues","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15951, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16030) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedDataSetDataType") , new LocalizedText("PublishedDataSetDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(197),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2376, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2377) , NodeClass.valueOf(2) ,new QualifiedName(0,"EnumStrings") , new LocalizedText("EnumStrings","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18760, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18762, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18761) , NodeClass.valueOf(2) ,new QualifiedName(0,"ConfiguredDataSetWriters") , new LocalizedText("ConfiguredDataSetWriters","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(198),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2311, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2379, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2408, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2410, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2412, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2414, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2418, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2420, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2422, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2424, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2378) , NodeClass.valueOf(8) ,new QualifiedName(0,"ProgramTransitionEventType") , new LocalizedText("ProgramTransitionEventType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,true));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18761, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18762) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(199),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2379) , NodeClass.valueOf(2) ,new QualifiedName(0,"IntermediateResult") , new LocalizedText("IntermediateResult","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18760, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18764, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18763) , NodeClass.valueOf(2) ,new QualifiedName(0,"ConfiguredDataSetReaders") , new LocalizedText("ConfiguredDataSetReaders","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(200),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15952, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16033) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedDataSetSourceDataType") , new LocalizedText("PublishedDataSetSourceDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(201),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2386, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2384, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2385, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2387, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2381, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2383, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2382, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2389, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2390, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2388, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,2380) , NodeClass.valueOf(16) ,new QualifiedName(0,"ProgramDiagnosticType") , new LocalizedText("ProgramDiagnosticType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,894) ,-1,null,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18763, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18764) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(202),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2381) , NodeClass.valueOf(2) ,new QualifiedName(0,"CreateSessionId") , new LocalizedText("CreateSessionId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(203),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18760, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18766, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18765) , NodeClass.valueOf(2) ,new QualifiedName(0,"OperationalDataSetWriters") , new LocalizedText("OperationalDataSetWriters","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(204),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2382) , NodeClass.valueOf(2) ,new QualifiedName(0,"CreateClientName") , new LocalizedText("CreateClientName","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18765, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18766) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(205),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15606, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15425, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16041, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16236, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16241, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16243, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15424, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16238, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16237, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16043, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16245, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16036) , NodeClass.valueOf(1) ,new QualifiedName(0,"WellKnownRole_Engineer") , new LocalizedText("Engineer","") , new LocalizedText("The Role is allowed to browse, read live data, read and update historical data/events, call methods or subscribe to data/events.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2383) , NodeClass.valueOf(2) ,new QualifiedName(0,"InvocationCreationTime") , new LocalizedText("InvocationCreationTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(206),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18760, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18768, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18767) , NodeClass.valueOf(2) ,new QualifiedName(0,"OperationalDataSetReaders") , new LocalizedText("OperationalDataSetReaders","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(207),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15953, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16037) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedDataItemsDataType") , new LocalizedText("PublishedDataItemsDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(208),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2384) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastTransitionTime") , new LocalizedText("LastTransitionTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(209),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18767, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,18768) , NodeClass.valueOf(2) ,new QualifiedName(0,"DiagnosticsLevel") , new LocalizedText("DiagnosticsLevel","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(210),NodeIdUtil.createNodeId(0,19723) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2385) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastMethodCall") , new LocalizedText("LastMethodCall","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2386) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastMethodSessionId") , new LocalizedText("LastMethodSessionId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(211),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15954, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16040) , NodeClass.valueOf(2) ,new QualifiedName(0,"PublishedEventsDataType") , new LocalizedText("PublishedEventsDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(212),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2387) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastMethodInputArguments") , new LocalizedText("LastMethodInputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16042, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16041) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddIdentity") , new LocalizedText("AddIdentity","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2388) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastMethodOutputArguments") , new LocalizedText("LastMethodOutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16041, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16042) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(213),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2389) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastMethodCallTime") , new LocalizedText("LastMethodCallTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(214),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16044, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16043) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveIdentity") , new LocalizedText("RemoveIdentity","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2390) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastMethodReturnStatus") , new LocalizedText("LastMethodReturnStatus","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,19) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16043, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16044) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(215),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2771, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2410, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2393, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3830, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2408, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2422, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2418, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2428, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2395, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2429, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2424, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2430, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2404, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2392, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2396, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2394, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2414, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2397, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2420, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3850, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2399, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2426, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2427, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2406, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3835, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2412, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2398, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,2391) , NodeClass.valueOf(8) ,new QualifiedName(0,"ProgramStateMachineType") , new LocalizedText("ProgramStateMachineType","") , new LocalizedText("A state machine for a program.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2392) , NodeClass.valueOf(2) ,new QualifiedName(0,"Creatable") , new LocalizedText("Creatable","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(216),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2393) , NodeClass.valueOf(2) ,new QualifiedName(0,"Deletable") , new LocalizedText("Deletable","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(217),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add8(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15955, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16047) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetWriterDataType") , new LocalizedText("DataSetWriterDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(218),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2394) , NodeClass.valueOf(2) ,new QualifiedName(0,"AutoDelete") , new LocalizedText("AutoDelete","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(219),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2395) , NodeClass.valueOf(2) ,new QualifiedName(0,"RecycleCount") , new LocalizedText("RecycleCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(220),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2396) , NodeClass.valueOf(2) ,new QualifiedName(0,"InstanceCount") , new LocalizedText("InstanceCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(221),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15956, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16050) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetWriterTransportDataType") , new LocalizedText("DataSetWriterTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(222),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2397) , NodeClass.valueOf(2) ,new QualifiedName(0,"MaxInstanceCount") , new LocalizedText("MaxInstanceCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(223),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2398) , NodeClass.valueOf(2) ,new QualifiedName(0,"MaxRecycleCount") , new LocalizedText("MaxRecycleCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(224),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15383, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3841, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3845, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3849, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15040, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3847, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3848, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3843, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3842, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3844, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3840, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15038, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",3846, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2399) , NodeClass.valueOf(2) ,new QualifiedName(0,"ProgramDiagnostic") , new LocalizedText("ProgramDiagnostic","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15396) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15987, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16053) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetWriterMessageDataType") , new LocalizedText("DataSetWriterMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(225),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2401, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2408, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2410, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2414, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2422, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2424, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2400) , NodeClass.valueOf(1) ,new QualifiedName(0,"Ready") , new LocalizedText("Ready","") , new LocalizedText("The Program is properly initialized and may be started.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2401) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateNumber") , new LocalizedText("StateNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(226),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2403, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2410, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2412, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2414, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2418, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2402) , NodeClass.valueOf(1) ,new QualifiedName(0,"Running") , new LocalizedText("Running","") , new LocalizedText("The Program is executing making progress towards completion.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13225, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13325) , NodeClass.valueOf(2) ,new QualifiedName(0,"ExpirationDate") , new LocalizedText("ExpirationDate","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(227),NodeIdUtil.createNodeId(0,13) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15988, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16056) , NodeClass.valueOf(2) ,new QualifiedName(0,"PubSubGroupDataType") , new LocalizedText("PubSubGroupDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(228),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2403) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateNumber") , new LocalizedText("StateNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(229),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13225, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13326) , NodeClass.valueOf(2) ,new QualifiedName(0,"CertificateType") , new LocalizedText("CertificateType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(230),NodeIdUtil.createNodeId(0,17) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2405, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2418, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2420, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2422, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2404) , NodeClass.valueOf(1) ,new QualifiedName(0,"Suspended") , new LocalizedText("Suspended","") , new LocalizedText("The Program has been stopped prior to reaching a terminal state but may be resumed.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13225, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13327) , NodeClass.valueOf(2) ,new QualifiedName(0,"Certificate") , new LocalizedText("Certificate","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2404, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2405) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateNumber") , new LocalizedText("StateNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(231),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2407, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2408, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2412, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2420, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2424, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2406) , NodeClass.valueOf(1) ,new QualifiedName(0,"Halted") , new LocalizedText("Halted","") , new LocalizedText("The Program is in a terminal or failed state, and it cannot be started or resumed without being reset.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2406, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2407) , NodeClass.valueOf(2) ,new QualifiedName(0,"StateNumber") , new LocalizedText("StateNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(232),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2409, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2406, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2430, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2408) , NodeClass.valueOf(1) ,new QualifiedName(0,"HaltedToReady") , new LocalizedText("HaltedToReady","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15990, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16062) , NodeClass.valueOf(2) ,new QualifiedName(0,"WriterGroupTransportDataType") , new LocalizedText("WriterGroupTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(233),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2408, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2409) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(234),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2411, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2426, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2410) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadyToRunning") , new LocalizedText("ReadyToRunning","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2410, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2411) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(235),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15991, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16065) , NodeClass.valueOf(2) ,new QualifiedName(0,"WriterGroupMessageDataType") , new LocalizedText("WriterGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(236),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2413, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2406, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2429, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2412) , NodeClass.valueOf(1) ,new QualifiedName(0,"RunningToHalted") , new LocalizedText("RunningToHalted","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2412, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2413) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(237),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2415, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2414) , NodeClass.valueOf(1) ,new QualifiedName(0,"RunningToReady") , new LocalizedText("RunningToReady","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15992, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16068) , NodeClass.valueOf(2) ,new QualifiedName(0,"PubSubConnectionDataType") , new LocalizedText("PubSubConnectionDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(238),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2414, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2415) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(239),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2417, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2404, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2427, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2416) , NodeClass.valueOf(1) ,new QualifiedName(0,"RunningToSuspended") , new LocalizedText("RunningToSuspended","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2416, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2417) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(240),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15993, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16071) , NodeClass.valueOf(2) ,new QualifiedName(0,"ConnectionTransportDataType") , new LocalizedText("ConnectionTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(241),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2419, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2402, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2404, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2428, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2418) , NodeClass.valueOf(1) ,new QualifiedName(0,"SuspendedToRunning") , new LocalizedText("SuspendedToRunning","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11575, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13341) , NodeClass.valueOf(2) ,new QualifiedName(0,"MimeType") , new LocalizedText("MimeType","") , new LocalizedText("The content of the file.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2418, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2419) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(242),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2421, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2404, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2406, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2429, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2420) , NodeClass.valueOf(1) ,new QualifiedName(0,"SuspendedToHalted") , new LocalizedText("SuspendedToHalted","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2420, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2421) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(243),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2423, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2404, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2422) , NodeClass.valueOf(1) ,new QualifiedName(0,"SuspendedToReady") , new LocalizedText("SuspendedToReady","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2422, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2423) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(244),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15995, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16077) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReaderGroupTransportDataType") , new LocalizedText("ReaderGroupTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(245),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2425, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,54) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,51) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2400, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,52) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2406, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2429, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,2424) , NodeClass.valueOf(1) ,new QualifiedName(0,"ReadyToHalted") , new LocalizedText("ReadyToHalted","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2424, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2425) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionNumber") , new LocalizedText("TransitionNumber","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(246),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2410, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,2426) , NodeClass.valueOf(4) ,new QualifiedName(0,"Start") , new LocalizedText("Start","") , new LocalizedText("Causes the Program to transition from the Ready state to the Running state.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15996, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16080) , NodeClass.valueOf(2) ,new QualifiedName(0,"ReaderGroupMessageDataType") , new LocalizedText("ReaderGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(247),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2416, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,2427) , NodeClass.valueOf(4) ,new QualifiedName(0,"Suspend") , new LocalizedText("Suspend","") , new LocalizedText("Causes the Program to transition from the Running state to the Suspended state.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2418, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,2428) , NodeClass.valueOf(4) ,new QualifiedName(0,"Resume") , new LocalizedText("Resume","") , new LocalizedText("Causes the Program to transition from the Suspended state to the Running state.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2412, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2420, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2424, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,2429) , NodeClass.valueOf(4) ,new QualifiedName(0,"Halt") , new LocalizedText("Halt","") , new LocalizedText("Causes the Program to transition from the Ready, Running or Suspended state to the Halted state.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16007, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16083) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetReaderDataType") , new LocalizedText("DataSetReaderDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(248),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,53) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2408, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,2430) , NodeClass.valueOf(4) ,new QualifiedName(0,"Reset") , new LocalizedText("Reset","") , new LocalizedText("Causes the Program to transition from the Halted state to the Ready state.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13390, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13387, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13393, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13354, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13395, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,13353) , NodeClass.valueOf(8) ,new QualifiedName(0,"FileDirectoryType") , new LocalizedText("FileDirectoryType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13355, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17718, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13358, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13363, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,13354) , NodeClass.valueOf(1) ,new QualifiedName(0,"<FileDirectoryName>") , new LocalizedText("<FileDirectoryName>","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add9(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13354, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13357, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13356, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13355) , NodeClass.valueOf(4) ,new QualifiedName(0,"CreateDirectory") , new LocalizedText("CreateDirectory","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16008, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16086) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetReaderTransportDataType") , new LocalizedText("DataSetReaderTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(249),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13355, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13356) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(250),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13355, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13357) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(251),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13354, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13359, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13360, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13358) , NodeClass.valueOf(4) ,new QualifiedName(0,"CreateFile") , new LocalizedText("CreateFile","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16009, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16089) , NodeClass.valueOf(2) ,new QualifiedName(0,"DataSetReaderMessageDataType") , new LocalizedText("DataSetReaderMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(252),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13358, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13359) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(253),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13358, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13360) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(254),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16010, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16092) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubscribedDataSetDataType") , new LocalizedText("SubscribedDataSetDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(255),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13354, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13364, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13365, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13363) , NodeClass.valueOf(4) ,new QualifiedName(0,"MoveOrCopy") , new LocalizedText("MoveOrCopy","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13363, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13364) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(256),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16011, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16095) , NodeClass.valueOf(2) ,new QualifiedName(0,"TargetVariablesDataType") , new LocalizedText("TargetVariablesDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(257),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13363, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13365) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(258),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11575, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13369, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13385, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13368, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13375, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13382, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13367, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13370, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13377, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11508, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,13366) , NodeClass.valueOf(1) ,new QualifiedName(0,"<FileName>") , new LocalizedText("<FileName>","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13367) , NodeClass.valueOf(2) ,new QualifiedName(0,"Size") , new LocalizedText("Size","") , new LocalizedText("The size of the file in bytes.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(259),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16012, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16098) , NodeClass.valueOf(2) ,new QualifiedName(0,"SubscribedDataSetMirrorDataType") , new LocalizedText("SubscribedDataSetMirrorDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(260),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10523, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11753, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18496, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10751, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11158, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",18347, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,10637) , NodeClass.valueOf(8) ,new QualifiedName(0,"OffNormalAlarmType") , new LocalizedText("OffNormalAlarmType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13368) , NodeClass.valueOf(2) ,new QualifiedName(0,"Writable") , new LocalizedText("Writable","") , new LocalizedText("Whether the file is writable.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(261),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13369) , NodeClass.valueOf(2) ,new QualifiedName(0,"UserWritable") , new LocalizedText("UserWritable","") , new LocalizedText("Whether the file is writable by the current user.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(262),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13370) , NodeClass.valueOf(2) ,new QualifiedName(0,"OpenCount") , new LocalizedText("OpenCount","") , new LocalizedText("The current number of open file handles.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(263),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13374, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13373, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13372) , NodeClass.valueOf(4) ,new QualifiedName(0,"Open") , new LocalizedText("Open","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13373) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(264),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16014, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16104) , NodeClass.valueOf(2) ,new QualifiedName(0,"UadpWriterGroupMessageDataType") , new LocalizedText("UadpWriterGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(265),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13374) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(266),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13376, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13375) , NodeClass.valueOf(4) ,new QualifiedName(0,"Close") , new LocalizedText("Close","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13375, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13376) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(267),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16015, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16107) , NodeClass.valueOf(2) ,new QualifiedName(0,"UadpDataSetWriterMessageDataType") , new LocalizedText("UadpDataSetWriterMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(268),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13379, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13377) , NodeClass.valueOf(4) ,new QualifiedName(0,"Read") , new LocalizedText("Read","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13377, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13378) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(269),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13377, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13379) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(270),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16016, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16110) , NodeClass.valueOf(2) ,new QualifiedName(0,"UadpDataSetReaderMessageDataType") , new LocalizedText("UadpDataSetReaderMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(271),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13381, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13380) , NodeClass.valueOf(4) ,new QualifiedName(0,"Write") , new LocalizedText("Write","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13381) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(272),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13384, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13383, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13382) , NodeClass.valueOf(4) ,new QualifiedName(0,"GetPosition") , new LocalizedText("GetPosition","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16017, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16113) , NodeClass.valueOf(2) ,new QualifiedName(0,"JsonWriterGroupMessageDataType") , new LocalizedText("JsonWriterGroupMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(273),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13382, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13383) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(274),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13382, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13384) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(275),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13366, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13386, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13385) , NodeClass.valueOf(4) ,new QualifiedName(0,"SetPosition") , new LocalizedText("SetPosition","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16018, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16116) , NodeClass.valueOf(2) ,new QualifiedName(0,"JsonDataSetWriterMessageDataType") , new LocalizedText("JsonDataSetWriterMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(276),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13385, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13386) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(277),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13388, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13389, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13387) , NodeClass.valueOf(4) ,new QualifiedName(0,"CreateDirectory") , new LocalizedText("CreateDirectory","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13387, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13388) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(278),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16019, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16119) , NodeClass.valueOf(2) ,new QualifiedName(0,"JsonDataSetReaderMessageDataType") , new LocalizedText("JsonDataSetReaderMessageDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(279),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13387, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13389) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(280),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13391, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13392, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13390) , NodeClass.valueOf(4) ,new QualifiedName(0,"CreateFile") , new LocalizedText("CreateFile","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",585, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7929) , NodeClass.valueOf(2) ,new QualifiedName(0,"ContentFilterElement") , new LocalizedText("ContentFilterElement","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(281),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13390, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13391) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(282),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13390, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13392) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(283),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13394, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13393) , NodeClass.valueOf(4) ,new QualifiedName(0,"Delete") , new LocalizedText("Delete","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",588, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7932) , NodeClass.valueOf(2) ,new QualifiedName(0,"ContentFilter") , new LocalizedText("ContentFilter","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(284),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13393, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13394) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(285),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16021, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16125) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrokerWriterGroupTransportDataType") , new LocalizedText("BrokerWriterGroupTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(286),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13396, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13397, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13395) , NodeClass.valueOf(4) ,new QualifiedName(0,"MoveOrCopy") , new LocalizedText("MoveOrCopy","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",96, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16127, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16126) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default XML") , new LocalizedText("Default XML","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13395, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13396) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(287),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16126, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16127) , NodeClass.valueOf(2) ,new QualifiedName(0,"RolePermissionType") , new LocalizedText("RolePermissionType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(288),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",591, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7935) , NodeClass.valueOf(2) ,new QualifiedName(0,"FilterOperand") , new LocalizedText("FilterOperand","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(289),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13395, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13397) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(290),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",594, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7938) , NodeClass.valueOf(2) ,new QualifiedName(0,"ElementOperand") , new LocalizedText("ElementOperand","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(291),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",128, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16131) , NodeClass.valueOf(2) ,new QualifiedName(0,"RolePermissionType") , new LocalizedText("RolePermissionType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(292),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",597, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7941) , NodeClass.valueOf(2) ,new QualifiedName(0,"LiteralOperand") , new LocalizedText("LiteralOperand","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(293),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16134) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultRolePermissions") , new LocalizedText("DefaultRolePermissions","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,96) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add10(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16135) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultUserRolePermissions") , new LocalizedText("DefaultUserRolePermissions","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,96) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15957, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16136) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultAccessRestrictions") , new LocalizedText("DefaultAccessRestrictions","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,95) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",600, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7944) , NodeClass.valueOf(2) ,new QualifiedName(0,"AttributeOperand") , new LocalizedText("AttributeOperand","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(294),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16137) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultRolePermissions") , new LocalizedText("DefaultRolePermissions","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,96) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16138) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultUserRolePermissions") , new LocalizedText("DefaultUserRolePermissions","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,96) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",11616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16139) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultAccessRestrictions") , new LocalizedText("DefaultAccessRestrictions","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,95) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",603, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,7947) , NodeClass.valueOf(2) ,new QualifiedName(0,"SimpleAttributeOperand") , new LocalizedText("SimpleAttributeOperand","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(295),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16022, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16144) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrokerDataSetWriterTransportDataType") , new LocalizedText("BrokerDataSetWriterTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(296),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16023, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16147) , NodeClass.valueOf(2) ,new QualifiedName(0,"BrokerDataSetReaderTransportDataType") , new LocalizedText("BrokerDataSetReaderTransportDataType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(297),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15528, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16150) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15534, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16151) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15578, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16152) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15580, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16153) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15581, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16154) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15582, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16155) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15597, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16156) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15598, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16157) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15605, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16158) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15609, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16159) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15611, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16161) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15608, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16162) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16173) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16174) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16175) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16177, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16176) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16176, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16177) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(298),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16179, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16178) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16178, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16179) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(299),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16181, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16180) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16180, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16181) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(300),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16183, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16182) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16182, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16183) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(301),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16192) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16193) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16194) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16196, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16195) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16195, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16196) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(302),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",661, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,8004) , NodeClass.valueOf(2) ,new QualifiedName(0,"HistoryEvent") , new LocalizedText("HistoryEvent","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(303),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16198, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16197) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16198) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(304),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16200, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16199) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16199, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16200) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(305),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15644, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16202, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16201) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16201, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16202) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(306),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16203) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16204) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16205) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16207, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16206) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16206, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16207) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(307),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16209, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16208) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16208, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16209) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(308),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16211, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16210) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16210, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16211) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(309),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15656, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16213, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16212) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",10637, nsTable)));
nodes2add.add(new UAObjectTypeNode(NodeIdUtil.createNodeId(0,10751) , NodeClass.valueOf(8) ,new QualifiedName(0,"TripAlarmType") , new LocalizedText("TripAlarmType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16212, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16213) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(310),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16214) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16215) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16216) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16218, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16217) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16217, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16218) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(311),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16220, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16219) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16219, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16220) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(312),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16222, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16221) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16221, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16222) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(313),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15668, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16224, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16223) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16223, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16224) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(314),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16225) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16226) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16227) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16229, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16228) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16228, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16229) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(315),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16231, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16230) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16230, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16231) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(316),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16233, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16232) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16233) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(317),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15680, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16235, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16234) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16234, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16235) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(318),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add11(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16236) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16237) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16238) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16240, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16239) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16240) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(319),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16242, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16241) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16241, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16242) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(320),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16244, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16243) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16243, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16244) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(321),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16036, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16246, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16245) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16245, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16246) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(322),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16247) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16248) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16249) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16251, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16250) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16250, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16251) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(323),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16253, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16252) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16253) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(324),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16255, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16254) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16254, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16255) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(325),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15692, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16257, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16256) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16257) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(326),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16258) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16259) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",721, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,8067) , NodeClass.valueOf(2) ,new QualifiedName(0,"MonitoringFilter") , new LocalizedText("MonitoringFilter","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(327),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16260) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16262, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16261) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16261, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16262) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(328),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16264, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16263) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16263, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16264) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(329),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",727, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,8073) , NodeClass.valueOf(2) ,new QualifiedName(0,"EventFilter") , new LocalizedText("EventFilter","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(330),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16266, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16265) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16265, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16266) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(331),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15704, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16268, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16267) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16267, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16268) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(332),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",950, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,8076) , NodeClass.valueOf(2) ,new QualifiedName(0,"AggregateConfiguration") , new LocalizedText("AggregateConfiguration","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(333),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16269) , NodeClass.valueOf(2) ,new QualifiedName(0,"Identities") , new LocalizedText("Identities","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15634) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16270) , NodeClass.valueOf(2) ,new QualifiedName(0,"Applications") , new LocalizedText("Applications","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,12) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16271) , NodeClass.valueOf(2) ,new QualifiedName(0,"Endpoints") , new LocalizedText("Endpoints","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,15528) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16273, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16272) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddApplication") , new LocalizedText("AddApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16272, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16273) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(334),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16275, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16274) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveApplication") , new LocalizedText("RemoveApplication","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16275) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(335),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16277, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16276) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddEndpoint") , new LocalizedText("AddEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16276, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16277) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(336),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15716, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16279, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16278) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveEndpoint") , new LocalizedText("RemoveEndpoint","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16278, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16279) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(337),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16280) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16281) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15618, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16282) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15621, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16284) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15622, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16285) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15623, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16286) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15628, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16287) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15629, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16288) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2013, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15607, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16299, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16296, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16295) , NodeClass.valueOf(1) ,new QualifiedName(0,"RoleSet") , new LocalizedText("RoleSet","") , new LocalizedText("Describes the roles supported by the server.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16295, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16297, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16298, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16296) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddRole") , new LocalizedText("AddRole","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16296, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16297) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(338),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16296, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16298) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(339),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16295, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16300, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16299) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveRole") , new LocalizedText("RemoveRole","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16299, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16300) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(340),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15606, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16302, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16303, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16301) , NodeClass.valueOf(4) ,new QualifiedName(0,"AddRole") , new LocalizedText("AddRole","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16301, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16302) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(341),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16301, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16303) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(342),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15606, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16305, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16304) , NodeClass.valueOf(4) ,new QualifiedName(0,"RemoveRole") , new LocalizedText("RemoveRole","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16304, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16305) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(343),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16306) , NodeClass.valueOf(2) ,new QualifiedName(0,"DefaultInputValues") , new LocalizedText("DefaultInputValues","") , new LocalizedText("Specifies the default values for optional input arguments.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15, nsTable)));
nodes2add.add(new UADataTypeNode(NodeIdUtil.createNodeId(0,16307) , NodeClass.valueOf(64) ,new QualifiedName(0,"AudioDataType") , new LocalizedText("AudioDataType","") , new LocalizedText("An image encoded in PNG format.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15630, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16308) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17633, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17632, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16312, nsTable)));
nodes2add.add(new UAVariableTypeNode(NodeIdUtil.createNodeId(0,16309) , NodeClass.valueOf(16) ,new QualifiedName(0,"SelectionListType") , new LocalizedText("SelectionListType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,24) ,-2,new UnsignedInteger[0],false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15631, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16310) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15635, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16311) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16309, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16312) , NodeClass.valueOf(2) ,new QualifiedName(0,"RestrictToList") , new LocalizedText("RestrictToList","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(344),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",22, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17541, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17547, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",17537, nsTable)));
nodes2add.add(new UADataTypeNode(NodeIdUtil.createNodeId(0,16313) , NodeClass.valueOf(64) ,new QualifiedName(0,"AdditionalParametersType") , new LocalizedText("AdditionalParametersType","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13353, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16348, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16354, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16356, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16351, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16314) , NodeClass.valueOf(1) ,new QualifiedName(0,"FileSystem") , new LocalizedText("FileSystem","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,38) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15645, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",76, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,16323) , NodeClass.valueOf(1) ,new QualifiedName(0,"Default JSON") , new LocalizedText("Default JSON","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add12(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12555, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12522, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13610, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13601, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13600, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13602, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13608, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13618, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13621, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13615, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13613, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13605, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13603, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13620, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(0,13599) , NodeClass.valueOf(1) ,new QualifiedName(0,"TrustList") , new LocalizedText("TrustList","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13600) , NodeClass.valueOf(2) ,new QualifiedName(0,"Size") , new LocalizedText("Size","") , new LocalizedText("The size of the file in bytes.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(345),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13601) , NodeClass.valueOf(2) ,new QualifiedName(0,"Writable") , new LocalizedText("Writable","") , new LocalizedText("Whether the file is writable.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(346),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13602) , NodeClass.valueOf(2) ,new QualifiedName(0,"UserWritable") , new LocalizedText("UserWritable","") , new LocalizedText("Whether the file is writable by the current user.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(347),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13603) , NodeClass.valueOf(2) ,new QualifiedName(0,"OpenCount") , new LocalizedText("OpenCount","") , new LocalizedText("The current number of open file handles.",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(348),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13607, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13606, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13605) , NodeClass.valueOf(4) ,new QualifiedName(0,"Open") , new LocalizedText("Open","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13605, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13606) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(349),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13605, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13607) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(350),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13609, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13608) , NodeClass.valueOf(4) ,new QualifiedName(0,"Close") , new LocalizedText("Close","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13608, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13609) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(351),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13611, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13612, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13610) , NodeClass.valueOf(4) ,new QualifiedName(0,"Read") , new LocalizedText("Read","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13610, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13611) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(352),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13610, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13612) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(353),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13614, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13613) , NodeClass.valueOf(4) ,new QualifiedName(0,"Write") , new LocalizedText("Write","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13613, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13614) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(354),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13616, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13615) , NodeClass.valueOf(4) ,new QualifiedName(0,"GetPosition") , new LocalizedText("GetPosition","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13615, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13616) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(355),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13615, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13617) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(356),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16314, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16349, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16350, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16348) , NodeClass.valueOf(4) ,new QualifiedName(0,"CreateDirectory") , new LocalizedText("CreateDirectory","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13619, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13618) , NodeClass.valueOf(4) ,new QualifiedName(0,"SetPosition") , new LocalizedText("SetPosition","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16348, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16349) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(357),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13618, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13619) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(358),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16348, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16350) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(359),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13620) , NodeClass.valueOf(2) ,new QualifiedName(0,"LastUpdateTime") , new LocalizedText("LastUpdateTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(360),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16314, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16352, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16353, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16351) , NodeClass.valueOf(4) ,new QualifiedName(0,"CreateFile") , new LocalizedText("CreateFile","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13599, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13623, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13622, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,13621) , NodeClass.valueOf(4) ,new QualifiedName(0,"OpenWithMasks") , new LocalizedText("OpenWithMasks","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16351, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16352) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(361),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13621, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13622) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(362),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16351, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16353) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(363),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",13621, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13623) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(364),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16314, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16355, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16354) , NodeClass.valueOf(4) ,new QualifiedName(0,"Delete") , new LocalizedText("Delete","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16354, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16355) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(365),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16314, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16358, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16357, nsTable)));
nodes2add.add(new UAMethodNode(NodeIdUtil.createNodeId(0,16356) , NodeClass.valueOf(4) ,new QualifiedName(0,"MoveOrCopy") , new LocalizedText("MoveOrCopy","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16356, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16357) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(366),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16356, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16358) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutputArguments") , new LocalizedText("OutputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(367),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",15749, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16359) , NodeClass.valueOf(2) ,new QualifiedName(0,"InputArguments") , new LocalizedText("InputArguments","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(368),NodeIdUtil.createNodeId(0,296) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",47, nsTable)));
nodes2add.add(new UAReferenceTypeNode(NodeIdUtil.createNodeId(0,16361) , NodeClass.valueOf(32) ,new QualifiedName(0,"HasAlarmSuppressionGroup") , new LocalizedText("HasAlarmSuppressionGroup","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false, new LocalizedText("IsAlarmSuppressionGroupOf","")));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",12555, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,13631) , NodeClass.valueOf(2) ,new QualifiedName(0,"CertificateTypes") , new LocalizedText("CertificateTypes","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,17) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,45) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",35, nsTable)));
nodes2add.add(new UAReferenceTypeNode(NodeIdUtil.createNodeId(0,16362) , NodeClass.valueOf(32) ,new QualifiedName(0,"AlarmGroupMember") , new LocalizedText("AlarmGroupMember","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,false,false, new LocalizedText("MemberOfAlarmGroup","")));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2782, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16363) , NodeClass.valueOf(2) ,new QualifiedName(0,"ConditionSubClassId") , new LocalizedText("ConditionSubClassId","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,17) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",7617, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",69, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,39) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",922, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,8172) , NodeClass.valueOf(2) ,new QualifiedName(0,"HistoryEventFieldList") , new LocalizedText("HistoryEventFieldList","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(369),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2782, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16364) , NodeClass.valueOf(2) ,new QualifiedName(0,"ConditionSubClassName") , new LocalizedText("ConditionSubClassName","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,1,new UnsignedInteger[]{new UnsignedInteger(0)},new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2915, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8995, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16379, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16376, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16378, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16372, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16371) , NodeClass.valueOf(2) ,new QualifiedName(0,"OutOfServiceState") , new LocalizedText("OutOfServiceState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16371, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16372) , NodeClass.valueOf(2) ,new QualifiedName(0,"Id") , new LocalizedText("Id","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(370),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16371, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16376) , NodeClass.valueOf(2) ,new QualifiedName(0,"TransitionTime") , new LocalizedText("TransitionTime","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(371),NodeIdUtil.createNodeId(0,294) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16371, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16378) , NodeClass.valueOf(2) ,new QualifiedName(0,"TrueState") , new LocalizedText("TrueState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(372),NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16371, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16379) , NodeClass.valueOf(2) ,new QualifiedName(0,"FalseState") , new LocalizedText("FalseState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(373),NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2915, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",8995, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16387, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16388, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16381, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16385, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",80, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16380) , NodeClass.valueOf(2) ,new QualifiedName(0,"SilenceState") , new LocalizedText("SilenceState","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,21) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,46) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",16380, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",68, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,16381) , NodeClass.valueOf(2) ,new QualifiedName(0,"Id") , new LocalizedText("Id","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(374),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,47) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",2197, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,37) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",78, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(0,2730) , NodeClass.valueOf(2) ,new QualifiedName(0,"RegisterNodesCount") , new LocalizedText("RegisterNodesCount","") , new LocalizedText("",""), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,Variant.NULL,NodeIdUtil.createNodeId(0,871) ,-1,null,new UnsignedByte(1),new UnsignedByte(1),0.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21329) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt32TestValue") , new LocalizedText("UInt32TestValue","en") , new LocalizedText("UInt32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(375),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21245, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21247, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21246, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21244) , NodeClass.valueOf(1) ,new QualifiedName(1,"CharToStringTests") , new LocalizedText("CharToStringTests","en") , new LocalizedText("CharToStringTests","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21330) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteTestValue") , new LocalizedText("SByteTestValue","en") , new LocalizedText("SByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(376),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21245) , NodeClass.valueOf(2) ,new QualifiedName(1,"Char1") , new LocalizedText("Char1","en") , new LocalizedText("Char1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(377),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21331) , NodeClass.valueOf(2) ,new QualifiedName(1,"DoubleTestValue") , new LocalizedText("DoubleTestValue","en") , new LocalizedText("DoubleTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(378),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21246) , NodeClass.valueOf(2) ,new QualifiedName(1,"Char2") , new LocalizedText("Char2","en") , new LocalizedText("Char2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(379),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21332) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult11") , new LocalizedText("ByteResult11","en") , new LocalizedText("ByteResult11","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(380),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21247) , NodeClass.valueOf(2) ,new QualifiedName(1,"String") , new LocalizedText("String","en") , new LocalizedText("String","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(381),NodeIdUtil.createNodeId(0,12) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21251, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21249, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21250, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21248) , NodeClass.valueOf(1) ,new QualifiedName(1,"OnReadTest") , new LocalizedText("OnReadTest","en") , new LocalizedText("OnReadTest","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21248, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21249) , NodeClass.valueOf(2) ,new QualifiedName(1,"OnReadInput1") , new LocalizedText("OnReadInput1","en") , new LocalizedText("OnReadInput1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(382),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21248, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21250) , NodeClass.valueOf(2) ,new QualifiedName(1,"OnReadInput2") , new LocalizedText("OnReadInput2","en") , new LocalizedText("OnReadInput2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(383),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21248, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21251) , NodeClass.valueOf(2) ,new QualifiedName(1,"OnReadResult") , new LocalizedText("OnReadResult","en") , new LocalizedText("OnReadResult","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(384),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21240, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21252) , NodeClass.valueOf(2) ,new QualifiedName(1,"Output2") , new LocalizedText("Output2","en") , new LocalizedText("Output2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(385),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21253) , NodeClass.valueOf(2) ,new QualifiedName(1,"Increment") , new LocalizedText("Increment","en") , new LocalizedText("Increment","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(386),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21254) , NodeClass.valueOf(2) ,new QualifiedName(1,"Result") , new LocalizedText("Result","en") , new LocalizedText("Result","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(387),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21255) , NodeClass.valueOf(2) ,new QualifiedName(1,"Signal") , new LocalizedText("Signal","en") , new LocalizedText("Signal","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(388),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add13(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21256) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result7") , new LocalizedText("Int16Result7","en") , new LocalizedText("Int16Result7","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(389),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21257) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result8") , new LocalizedText("Int16Result8","en") , new LocalizedText("Int16Result8","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(390),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21258) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result9") , new LocalizedText("Int16Result9","en") , new LocalizedText("Int16Result9","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(391),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21259) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result10") , new LocalizedText("Int16Result10","en") , new LocalizedText("Int16Result10","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(392),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21260) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result11") , new LocalizedText("Int16Result11","en") , new LocalizedText("Int16Result11","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(393),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21261) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt16TestValue") , new LocalizedText("UInt16TestValue","en") , new LocalizedText("UInt16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(394),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21262) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt32TestValue") , new LocalizedText("UInt32TestValue","en") , new LocalizedText("UInt32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(395),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21263, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",25, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",26, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21256, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21257, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21258, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",22, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",24, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21262, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21260, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",23, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21259, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",41, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",17, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21261, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",19, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",20, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21204, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21205, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",27, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",18, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,15) , NodeClass.valueOf(1) ,new QualifiedName(1,"Int16TestValues") , new LocalizedText("Int16TestValues","en") , new LocalizedText("Int16TestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21263) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt64TestValue") , new LocalizedText("UInt64TestValue","en") , new LocalizedText("UInt64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(396),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21280, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21265, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21268, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21269, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21273, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21274, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21281, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21286, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21282, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21271, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21279, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21278, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21266, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21275, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21267, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21276, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21270, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21285, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21272, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21277, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21283, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21284, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21264) , NodeClass.valueOf(1) ,new QualifiedName(1,"Int32TestValues") , new LocalizedText("Int32TestValues","en") , new LocalizedText("Int32TestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21265) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result4") , new LocalizedText("Int32Result4","en") , new LocalizedText("Int32Result4","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(397),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,17) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteTestValue") , new LocalizedText("ByteTestValue","en") , new LocalizedText("ByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(398),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21266) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32TestValue") , new LocalizedText("Int32TestValue","en") , new LocalizedText("Int32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(399),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,18) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result1") , new LocalizedText("Int16Result1","en") , new LocalizedText("Int16Result1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(400),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,19) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result2") , new LocalizedText("Int16Result2","en") , new LocalizedText("Int16Result2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(401),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21267) , NodeClass.valueOf(2) ,new QualifiedName(1,"FloatTestValue") , new LocalizedText("FloatTestValue","en") , new LocalizedText("FloatTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(402),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21268) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result2") , new LocalizedText("Int32Result2","en") , new LocalizedText("Int32Result2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(403),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,20) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result3") , new LocalizedText("Int16Result3","en") , new LocalizedText("Int16Result3","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(404),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21269) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16TestValue") , new LocalizedText("Int16TestValue","en") , new LocalizedText("Int16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(405),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result4") , new LocalizedText("Int16Result4","en") , new LocalizedText("Int16Result4","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(406),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,22) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result5") , new LocalizedText("Int16Result5","en") , new LocalizedText("Int16Result5","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(407),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21270) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteTestValue") , new LocalizedText("ByteTestValue","en") , new LocalizedText("ByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(408),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21271) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanTestValue") , new LocalizedText("BooleanTestValue","en") , new LocalizedText("BooleanTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(409),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,23) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32TestValue") , new LocalizedText("Int32TestValue","en") , new LocalizedText("Int32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(410),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,24) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64TestValue") , new LocalizedText("Int64TestValue","en") , new LocalizedText("Int64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(411),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21272) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteTestValue") , new LocalizedText("SByteTestValue","en") , new LocalizedText("SByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(412),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,25) , NodeClass.valueOf(2) ,new QualifiedName(1,"FloatTestValue") , new LocalizedText("FloatTestValue","en") , new LocalizedText("FloatTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(413),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21273) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result3") , new LocalizedText("Int32Result3","en") , new LocalizedText("Int32Result3","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(414),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,26) , NodeClass.valueOf(2) ,new QualifiedName(1,"DoubleTestValue") , new LocalizedText("DoubleTestValue","en") , new LocalizedText("DoubleTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(415),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21274) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result5") , new LocalizedText("Int32Result5","en") , new LocalizedText("Int32Result5","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(416),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21275) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result1") , new LocalizedText("Int32Result1","en") , new LocalizedText("Int32Result1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(417),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,27) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16Result6") , new LocalizedText("Int16Result6","en") , new LocalizedText("Int16Result6","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(418),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21211, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21213, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",30, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",32, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21210, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",34, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",37, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21214, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21206, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",29, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21207, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",40, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21209, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21215, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",31, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21212, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",36, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21208, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",35, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",33, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",39, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",38, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,28) , NodeClass.valueOf(1) ,new QualifiedName(1,"BooleanTestValues") , new LocalizedText("BooleanTestValues","en") , new LocalizedText("BooleanTestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21276) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result6") , new LocalizedText("Int32Result6","en") , new LocalizedText("Int32Result6","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(419),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,29) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteTestValue") , new LocalizedText("ByteTestValue","en") , new LocalizedText("ByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(420),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21277) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64TestValue") , new LocalizedText("Int64TestValue","en") , new LocalizedText("Int64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(421),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,30) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult1") , new LocalizedText("BooleanResult1","en") , new LocalizedText("BooleanResult1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(422),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21278) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result7") , new LocalizedText("Int32Result7","en") , new LocalizedText("Int32Result7","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(423),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,31) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult2") , new LocalizedText("BooleanResult2","en") , new LocalizedText("BooleanResult2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(424),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21279) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result8") , new LocalizedText("Int32Result8","en") , new LocalizedText("Int32Result8","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(425),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,32) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult3") , new LocalizedText("BooleanResult3","en") , new LocalizedText("BooleanResult3","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(426),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21280) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result9") , new LocalizedText("Int32Result9","en") , new LocalizedText("Int32Result9","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(427),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21281) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result10") , new LocalizedText("Int32Result10","en") , new LocalizedText("Int32Result10","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(428),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,33) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult4") , new LocalizedText("BooleanResult4","en") , new LocalizedText("BooleanResult4","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(429),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,34) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult5") , new LocalizedText("BooleanResult5","en") , new LocalizedText("BooleanResult5","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(430),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21282) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32Result11") , new LocalizedText("Int32Result11","en") , new LocalizedText("Int32Result11","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(431),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,35) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32TestValue") , new LocalizedText("Int32TestValue","en") , new LocalizedText("Int32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(432),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21283) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt16TestValue") , new LocalizedText("UInt16TestValue","en") , new LocalizedText("UInt16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(433),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,36) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64TestValue") , new LocalizedText("Int64TestValue","en") , new LocalizedText("Int64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(434),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21284) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt32TestValue") , new LocalizedText("UInt32TestValue","en") , new LocalizedText("UInt32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(435),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,37) , NodeClass.valueOf(2) ,new QualifiedName(1,"FloatTestValue") , new LocalizedText("FloatTestValue","en") , new LocalizedText("FloatTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(436),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21285) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt64TestValue") , new LocalizedText("UInt64TestValue","en") , new LocalizedText("UInt64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(437),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21264, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21286) , NodeClass.valueOf(2) ,new QualifiedName(1,"DoubleTestValue") , new LocalizedText("DoubleTestValue","en") , new LocalizedText("DoubleTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(438),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,38) , NodeClass.valueOf(2) ,new QualifiedName(1,"DoubleTestValue") , new LocalizedText("DoubleTestValue","en") , new LocalizedText("DoubleTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(439),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21306, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21308, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21293, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21309, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21301, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21300, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21304, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21298, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21303, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21291, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21289, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21302, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21288, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21299, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21296, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21295, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21290, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21305, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21294, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21292, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21307, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21297, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21287) , NodeClass.valueOf(1) ,new QualifiedName(1,"Int64TestValues") , new LocalizedText("Int64TestValues","en") , new LocalizedText("Int64TestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,39) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult6") , new LocalizedText("BooleanResult6","en") , new LocalizedText("BooleanResult6","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(440),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,40) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanTestValue") , new LocalizedText("BooleanTestValue","en") , new LocalizedText("BooleanTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(441),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21288) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32TestValue") , new LocalizedText("Int32TestValue","en") , new LocalizedText("Int32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(442),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21289) , NodeClass.valueOf(2) ,new QualifiedName(1,"FloatTestValue") , new LocalizedText("FloatTestValue","en") , new LocalizedText("FloatTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(443),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,41) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanTestValue") , new LocalizedText("BooleanTestValue","en") , new LocalizedText("BooleanTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(444),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21204) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteTestValue") , new LocalizedText("SByteTestValue","en") , new LocalizedText("SByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(445),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21290) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result9") , new LocalizedText("Int64Result9","en") , new LocalizedText("Int64Result9","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(446),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",15, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21205) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16TestValue") , new LocalizedText("Int16TestValue","en") , new LocalizedText("Int16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(447),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add14(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21291) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result3") , new LocalizedText("Int64Result3","en") , new LocalizedText("Int64Result3","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(448),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21206) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteTestValue") , new LocalizedText("SByteTestValue","en") , new LocalizedText("SByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(449),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21292) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanTestValue") , new LocalizedText("BooleanTestValue","en") , new LocalizedText("BooleanTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(450),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21207) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16TestValue") , new LocalizedText("Int16TestValue","en") , new LocalizedText("Int16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(451),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21293) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result2") , new LocalizedText("Int64Result2","en") , new LocalizedText("Int64Result2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(452),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21208) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt16TestValue") , new LocalizedText("UInt16TestValue","en") , new LocalizedText("UInt16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(453),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21294) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result5") , new LocalizedText("Int64Result5","en") , new LocalizedText("Int64Result5","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(454),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21209) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt32TestValue") , new LocalizedText("UInt32TestValue","en") , new LocalizedText("UInt32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(455),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21295) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteTestValue") , new LocalizedText("ByteTestValue","en") , new LocalizedText("ByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(456),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21210) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt64TestValue") , new LocalizedText("UInt64TestValue","en") , new LocalizedText("UInt64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(457),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21296) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16TestValue") , new LocalizedText("Int16TestValue","en") , new LocalizedText("Int16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(458),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21211) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult7") , new LocalizedText("BooleanResult7","en") , new LocalizedText("BooleanResult7","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(459),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21297) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result1") , new LocalizedText("Int64Result1","en") , new LocalizedText("Int64Result1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(460),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21212) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult8") , new LocalizedText("BooleanResult8","en") , new LocalizedText("BooleanResult8","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(461),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21298) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt32TestValue") , new LocalizedText("UInt32TestValue","en") , new LocalizedText("UInt32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(462),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21213) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult9") , new LocalizedText("BooleanResult9","en") , new LocalizedText("BooleanResult9","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(463),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21299) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt64TestValue") , new LocalizedText("UInt64TestValue","en") , new LocalizedText("UInt64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(464),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21214) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult10") , new LocalizedText("BooleanResult10","en") , new LocalizedText("BooleanResult10","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(465),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21300) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result6") , new LocalizedText("Int64Result6","en") , new LocalizedText("Int64Result6","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(466),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",28, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21215) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanResult11") , new LocalizedText("BooleanResult11","en") , new LocalizedText("BooleanResult11","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(467),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21301) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result4") , new LocalizedText("Int64Result4","en") , new LocalizedText("Int64Result4","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(468),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21224, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21221, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21230, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21226, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21218, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21217, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21233, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21229, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21220, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21228, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21231, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21223, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21238, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21222, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21235, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21237, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21232, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21234, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21227, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21236, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21219, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21225, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21216) , NodeClass.valueOf(1) ,new QualifiedName(1,"SByteTestValues") , new LocalizedText("SByteTestValues","en") , new LocalizedText("SByteTestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21302) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt16TestValue") , new LocalizedText("UInt16TestValue","en") , new LocalizedText("UInt16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(469),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21217) , NodeClass.valueOf(2) ,new QualifiedName(1,"FloatTestValue") , new LocalizedText("FloatTestValue","en") , new LocalizedText("FloatTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(470),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21303) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result11") , new LocalizedText("Int64Result11","en") , new LocalizedText("Int64Result11","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(471),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21218) , NodeClass.valueOf(2) ,new QualifiedName(1,"DoubleTestValue") , new LocalizedText("DoubleTestValue","en") , new LocalizedText("DoubleTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(472),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21304) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result8") , new LocalizedText("Int64Result8","en") , new LocalizedText("Int64Result8","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(473),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21219) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult1") , new LocalizedText("SByteResult1","en") , new LocalizedText("SByteResult1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(474),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21305) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteTestValue") , new LocalizedText("SByteTestValue","en") , new LocalizedText("SByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(475),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21220) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult8") , new LocalizedText("SByteResult8","en") , new LocalizedText("SByteResult8","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(476),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21306) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64TestValue") , new LocalizedText("Int64TestValue","en") , new LocalizedText("Int64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(477),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21221) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult5") , new LocalizedText("SByteResult5","en") , new LocalizedText("SByteResult5","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(478),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21307) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result10") , new LocalizedText("Int64Result10","en") , new LocalizedText("Int64Result10","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(479),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21222) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt32TestValue") , new LocalizedText("UInt32TestValue","en") , new LocalizedText("UInt32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(480),NodeIdUtil.createNodeId(0,7) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21308) , NodeClass.valueOf(2) ,new QualifiedName(1,"DoubleTestValue") , new LocalizedText("DoubleTestValue","en") , new LocalizedText("DoubleTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(481),NodeIdUtil.createNodeId(0,11) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21223) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64TestValue") , new LocalizedText("Int64TestValue","en") , new LocalizedText("Int64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(482),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21287, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21309) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64Result7") , new LocalizedText("Int64Result7","en") , new LocalizedText("Int64Result7","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(483),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21224) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteTestValue") , new LocalizedText("ByteTestValue","en") , new LocalizedText("ByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(484),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21327, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21329, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21322, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21319, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21330, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21311, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21328, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21325, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21316, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21326, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21318, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21320, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21312, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21332, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21314, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21324, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21323, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21317, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21321, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21315, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21331, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21313, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21310) , NodeClass.valueOf(1) ,new QualifiedName(1,"ByteTestValues") , new LocalizedText("ByteTestValues","en") , new LocalizedText("ByteTestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21225) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult10") , new LocalizedText("SByteResult10","en") , new LocalizedText("SByteResult10","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(485),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21311) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult4") , new LocalizedText("ByteResult4","en") , new LocalizedText("ByteResult4","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(486),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21226) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanTestValue") , new LocalizedText("BooleanTestValue","en") , new LocalizedText("BooleanTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(487),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21312) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult8") , new LocalizedText("ByteResult8","en") , new LocalizedText("ByteResult8","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(488),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21227) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult4") , new LocalizedText("SByteResult4","en") , new LocalizedText("SByteResult4","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(489),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21313) , NodeClass.valueOf(2) ,new QualifiedName(1,"BooleanTestValue") , new LocalizedText("BooleanTestValue","en") , new LocalizedText("BooleanTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(490),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21228) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt64TestValue") , new LocalizedText("UInt64TestValue","en") , new LocalizedText("UInt64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(491),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21314) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult10") , new LocalizedText("ByteResult10","en") , new LocalizedText("ByteResult10","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(492),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21229) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult6") , new LocalizedText("SByteResult6","en") , new LocalizedText("SByteResult6","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(493),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21315) , NodeClass.valueOf(2) ,new QualifiedName(1,"FloatTestValue") , new LocalizedText("FloatTestValue","en") , new LocalizedText("FloatTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(494),NodeIdUtil.createNodeId(0,10) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21230) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult2") , new LocalizedText("SByteResult2","en") , new LocalizedText("SByteResult2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(495),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21316) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt64TestValue") , new LocalizedText("UInt64TestValue","en") , new LocalizedText("UInt64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(496),NodeIdUtil.createNodeId(0,9) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21231) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32TestValue") , new LocalizedText("Int32TestValue","en") , new LocalizedText("Int32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(497),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21317) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult6") , new LocalizedText("ByteResult6","en") , new LocalizedText("ByteResult6","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(498),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21232) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult9") , new LocalizedText("SByteResult9","en") , new LocalizedText("SByteResult9","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(499),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21318) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int64TestValue") , new LocalizedText("Int64TestValue","en") , new LocalizedText("Int64TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(500),NodeIdUtil.createNodeId(0,8) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21233) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt16TestValue") , new LocalizedText("UInt16TestValue","en") , new LocalizedText("UInt16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(501),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21319) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteTestValue") , new LocalizedText("ByteTestValue","en") , new LocalizedText("ByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(502),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21234) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16TestValue") , new LocalizedText("Int16TestValue","en") , new LocalizedText("Int16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(503),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21320) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int16TestValue") , new LocalizedText("Int16TestValue","en") , new LocalizedText("Int16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(504),NodeIdUtil.createNodeId(0,4) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21235) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult7") , new LocalizedText("SByteResult7","en") , new LocalizedText("SByteResult7","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(505),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21321) , NodeClass.valueOf(2) ,new QualifiedName(1,"Int32TestValue") , new LocalizedText("Int32TestValue","en") , new LocalizedText("Int32TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(506),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21236) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteTestValue") , new LocalizedText("SByteTestValue","en") , new LocalizedText("SByteTestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(507),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21322) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult3") , new LocalizedText("ByteResult3","en") , new LocalizedText("ByteResult3","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(508),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21237) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult11") , new LocalizedText("SByteResult11","en") , new LocalizedText("SByteResult11","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(509),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21323) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult7") , new LocalizedText("ByteResult7","en") , new LocalizedText("ByteResult7","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(510),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21216, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21238) , NodeClass.valueOf(2) ,new QualifiedName(1,"SByteResult3") , new LocalizedText("SByteResult3","en") , new LocalizedText("SByteResult3","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(511),NodeIdUtil.createNodeId(0,2) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21324) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult9") , new LocalizedText("ByteResult9","en") , new LocalizedText("ByteResult9","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(512),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",85, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21253, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21255, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21240, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21248, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21244, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21254, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21239) , NodeClass.valueOf(1) ,new QualifiedName(1,"AnyTestValues") , new LocalizedText("AnyTestValues","en") , new LocalizedText("AnyTestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21325) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult5") , new LocalizedText("ByteResult5","en") , new LocalizedText("ByteResult5","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(513),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21239, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",61, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21243, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21252, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21241, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , false,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21242, nsTable)));
nodes2add.add(new UAServerObjectNode(NodeIdUtil.createNodeId(1,21240) , NodeClass.valueOf(1) ,new QualifiedName(1,"BitTestValues") , new LocalizedText("BitTestValues","en") , new LocalizedText("BitTestValues","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,new UnsignedByte(0)));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
private void add15(NamespaceTable nsTable, UAServerApplicationInstance server, List<DataValue> values,  List<ReferenceNode> references2add){
List<Node> nodes2add = new ArrayList<>();
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21326) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult2") , new LocalizedText("ByteResult2","en") , new LocalizedText("ByteResult2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(514),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21240, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21241) , NodeClass.valueOf(2) ,new QualifiedName(1,"Bit1") , new LocalizedText("Bit1","en") , new LocalizedText("Bit1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(515),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21327) , NodeClass.valueOf(2) ,new QualifiedName(1,"UInt16TestValue") , new LocalizedText("UInt16TestValue","en") , new LocalizedText("UInt16TestValue","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(516),NodeIdUtil.createNodeId(0,5) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21240, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21242) , NodeClass.valueOf(2) ,new QualifiedName(1,"Bit2") , new LocalizedText("Bit2","en") , new LocalizedText("Bit2","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(517),NodeIdUtil.createNodeId(0,1) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21310, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21328) , NodeClass.valueOf(2) ,new QualifiedName(1,"ByteResult1") , new LocalizedText("ByteResult1","en") , new LocalizedText("ByteResult1","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(518),NodeIdUtil.createNodeId(0,3) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),1000.0,false));
references2add.clear();
}
{
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,35) , true,new ExpandedNodeId(new UnsignedInteger(0),"bichler.tech",21240, nsTable)));
references2add.add(new ReferenceNode(NodeIdUtil.createNodeId(0,40) , false,new ExpandedNodeId(new UnsignedInteger(0),"http://opcfoundation.org/UA/",63, nsTable)));
nodes2add.add(new UAServerVariableNode(NodeIdUtil.createNodeId(1,21243) , NodeClass.valueOf(2) ,new QualifiedName(1,"Output") , new LocalizedText("Output","en") , new LocalizedText("Output","en"), new UnsignedInteger(0) , new UnsignedInteger(0) ,references2add.toArray(new ReferenceNode[0]) ,values.get(519),NodeIdUtil.createNodeId(0,6) ,-1,null,new UnsignedByte(3),new UnsignedByte(3),100.0,false));
references2add.clear();
}
server.importModel(nsTable, nodes2add.toArray(new Node[0]));
}
protected List<DataValue> readValues(){
List<DataValue> values = new ArrayList<>();
InputStream is = this.getClass().getClassLoader().getResourceAsStream("values2.v");
BinaryDecoder decoder = new BinaryDecoder(is, 2147483647);
EncoderContext ctx = EncoderContext.getDefaultInstance();
decoder.setEncoderContext(ctx);
long position = 0;
long lastPosition = 0;
long lastSize = 0;
try{

 while (true) {
long size = values.size();
try {
DataValue v = decoder.getDataValue(null);
position = decoder.getReadable().position();
values.add(v);
} catch (DecodingException e) {
if (lastSize == size) {
try {
is.close();
} catch (IOException e2) {}
break;
}
try {
is.close();
} catch (IOException e2) {}
is = this.getClass().getClassLoader().getResourceAsStream("values2.v");
lastPosition += position;
is.skip(lastPosition);
decoder = new BinaryDecoder(is, 2147483647);
decoder.setEncoderContext(ctx);
lastSize = values.size();
}
}}catch(IOException e3){e3.printStackTrace();}

return values;
}

protected void init(UAServerApplicationInstance server){
NamespaceTable nsTable = new NamespaceTable();
nsTable.add(0, "http://opcfoundation.org/UA/");
nsTable.add(1, "bichler.tech");

List<DataValue> values = readValues();
List<ReferenceNode> references2add = new ArrayList<>();
add0(nsTable, server, values, references2add);
add1(nsTable, server, values, references2add);
add2(nsTable, server, values, references2add);
add3(nsTable, server, values, references2add);
add4(nsTable, server, values, references2add);
add5(nsTable, server, values, references2add);
add6(nsTable, server, values, references2add);
add7(nsTable, server, values, references2add);
add8(nsTable, server, values, references2add);
add9(nsTable, server, values, references2add);
add10(nsTable, server, values, references2add);
add11(nsTable, server, values, references2add);
add12(nsTable, server, values, references2add);
add13(nsTable, server, values, references2add);
add14(nsTable, server, values, references2add);
add15(nsTable, server, values, references2add);
}
}