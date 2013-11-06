/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.PropertyTemplateItem;
import org.eclipse.jqvt.jQVT.Query;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.RelationDomain;
import org.eclipse.jqvt.jQVT.Transformation;
import org.eclipse.jqvt.jvmmodel.DependencyInfo;
import org.eclipse.jqvt.jvmmodel.DependencyProcessor;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmVisibilityExtension;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer;

/**
 * Infers a JVM model from the JQVT model.
 */
@SuppressWarnings("all")
public class JQVTJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private DependencyProcessor _dependencyProcessor;
  
  @Inject
  @Extension
  private JvmVisibilityExtension _jvmVisibilityExtension;
  
  @Inject
  @Extension
  private JvmOnlyTypeConformanceComputer _jvmOnlyTypeConformanceComputer;
  
  @Inject
  @Extension
  private JQVTUtils _jQVTUtils;
  
  public String getParamName(final RelationDomain domain) {
    String _name = this._jQVTUtils.getName(domain);
    return _name;
  }
  
  public String triggerName(final Relation r) {
    boolean _isTopRelation = r.isTopRelation();
    if (_isTopRelation) {
      String _name = r.getName();
      return ("top_relation_" + _name);
    }
    String _name_1 = r.getName();
    return ("relation_" + _name_1);
  }
  
  public String tracesName(final Relation r) {
    String _name = r.getName();
    String _plus = ("traces_" + _name);
    return _plus;
  }
  
  public Iterable<RelationDomain> getSourceDomains(final Relation relation) {
    Iterable<RelationDomain> _uniqueDomains = this._jQVTUtils.getUniqueDomains(relation);
    final Function1<RelationDomain,Boolean> _function = new Function1<RelationDomain,Boolean>() {
        public Boolean apply(final RelationDomain domain) {
          boolean _isTarget = JQVTJvmModelInferrer.this._jQVTUtils.isTarget(domain);
          boolean _not = (!_isTarget);
          return Boolean.valueOf(_not);
        }
      };
    Iterable<RelationDomain> _filter = IterableExtensions.<RelationDomain>filter(_uniqueDomains, _function);
    return _filter;
  }
  
  public Iterable<RelationDomain> getTargetDomains(final Relation relation) {
    Iterable<RelationDomain> _uniqueDomains = this._jQVTUtils.getUniqueDomains(relation);
    final Function1<RelationDomain,Boolean> _function = new Function1<RelationDomain,Boolean>() {
        public Boolean apply(final RelationDomain domain) {
          boolean _isTarget = JQVTJvmModelInferrer.this._jQVTUtils.isTarget(domain);
          return Boolean.valueOf(_isTarget);
        }
      };
    Iterable<RelationDomain> _filter = IterableExtensions.<RelationDomain>filter(_uniqueDomains, _function);
    return _filter;
  }
  
  public String simpleTypeName(final XVariableDeclaration decl) {
    String _xifexpression = null;
    JvmTypeReference _type = decl.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      JvmTypeReference _type_1 = decl.getType();
      String _simpleName = _type_1.getSimpleName();
      _xifexpression = _simpleName;
    } else {
      _xifexpression = "unknown_type";
    }
    return _xifexpression;
  }
  
  public EObject eNull() {
    JvmTypeParameter _createJvmTypeParameter = TypesFactory.eINSTANCE.createJvmTypeParameter();
    return _createJvmTypeParameter;
  }
  
  public String relBody(final Relation relation, final boolean useTraces, final boolean onlyTraces) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = relation.getName();
    _builder.append(_name, "");
    _builder.append(" result = new ");
    String _name_1 = relation.getName();
    _builder.append(_name_1, "");
    _builder.append("(");
    {
      Iterable<RelationDomain> _sourceDomains = this.getSourceDomains(relation);
      boolean _hasElements = false;
      for(final RelationDomain domain : _sourceDomains) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _paramName = this.getParamName(domain);
        _builder.append(_paramName, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      if (useTraces) {
        _builder.append("if (");
        String _tracesName = this.tracesName(relation);
        _builder.append(_tracesName, "");
        _builder.append("==null) ");
        String _tracesName_1 = this.tracesName(relation);
        _builder.append(_tracesName_1, "");
        _builder.append(" = new java.util.HashMap<");
        String _name_2 = relation.getName();
        _builder.append(_name_2, "");
        _builder.append(",");
        String _name_3 = relation.getName();
        _builder.append(_name_3, "");
        _builder.append(">();");
        _builder.newLineIfNotEmpty();
        _builder.append("if (");
        String _tracesName_2 = this.tracesName(relation);
        _builder.append(_tracesName_2, "");
        _builder.append(".containsKey(result)) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("result = ");
        String _tracesName_3 = this.tracesName(relation);
        _builder.append(_tracesName_3, "	");
        _builder.append(".get(result);");
        _builder.newLineIfNotEmpty();
        _builder.append("} else {");
        _builder.newLine();
        {
          if (onlyTraces) {
            _builder.append("\t");
            _builder.append("return null;");
            _builder.newLine();
          } else {
            _builder.append("\t");
            String _tracesName_4 = this.tracesName(relation);
            _builder.append(_tracesName_4, "	");
            _builder.append(".put(result,null);");
            _builder.newLineIfNotEmpty();
            {
              boolean _isTopRelation = relation.isTopRelation();
              boolean _not = (!_isTopRelation);
              if (_not) {
                {
                  Iterable<RelationDomain> _targetDomains = this.getTargetDomains(relation);
                  for(final RelationDomain domain_1 : _targetDomains) {
                    _builder.append("\t");
                    _builder.append("result.");
                    String _name_4 = this._jQVTUtils.getName(domain_1);
                    _builder.append(_name_4, "	");
                    _builder.append(" = ");
                    String _paramName_1 = this.getParamName(domain_1);
                    _builder.append(_paramName_1, "	");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("if (!result.execute(this)) return null;");
            _builder.newLine();
            _builder.append("\t");
            String _tracesName_5 = this.tracesName(relation);
            _builder.append(_tracesName_5, "	");
            _builder.append(".put(result,result);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("if (!result.execute(this)) return null;");
        _builder.newLine();
      }
    }
    _builder.append("return result;");
    return _builder.toString();
  }
  
  protected void _infer(final Transformation transformation, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    this._dependencyProcessor.clearStaleDependencyInfos(transformation);
    EObject _eContainer = transformation.eContainer();
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_eContainer);
    QualifiedName _append = _fullyQualifiedName.append("Transformation");
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          it.setAbstract(true);
          String _documentation = JQVTJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(transformation);
          JQVTJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
        }
      };
    final JvmGenericType trafoType = this._jvmTypesBuilder.toClass(transformation, _append, _function);
    acceptor.<JvmGenericType>accept(trafoType);
    EList<Query> _queries = transformation.getQueries();
    for (final Query query : _queries) {
      EList<JvmMember> _members = trafoType.getMembers();
      String _name = query.getName();
      JvmTypeReference _type = query.getType();
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            EList<JvmFormalParameter> _params = query.getParams();
            for (final JvmFormalParameter p : _params) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              String _name = p.getName();
              JvmTypeReference _parameterType = p.getParameterType();
              JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(p, _name, _parameterType);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            String _documentation = JQVTJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(query);
            JQVTJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            XExpression _body = query.getBody();
            JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
          }
        };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(query, _name, _type, _function_1);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    }
    EList<Relation> _rules = transformation.getRules();
    for (final Relation relation : _rules) {
      {
        QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(relation);
        final Procedure1<JvmGenericType> _function_2 = new Procedure1<JvmGenericType>() {
            public void apply(final JvmGenericType it) {
              String _documentation = JQVTJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(relation);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
              EList<JvmMember> _members = it.getMembers();
              JvmParameterizedTypeReference _createTypeRef = JQVTJvmModelInferrer.this._typeReferences.createTypeRef(trafoType);
              JvmField _field = JQVTJvmModelInferrer.this._jvmTypesBuilder.toField(relation, "trafo", _createTypeRef);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              EObject _eNull = JQVTJvmModelInferrer.this.eNull();
              JvmTypeReference _newTypeRef = JQVTJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(relation, int.class);
              JvmField _field_1 = JQVTJvmModelInferrer.this._jvmTypesBuilder.toField(_eNull, "hash", _newTypeRef);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
              EList<JvmMember> _members_2 = it.getMembers();
              EObject _eNull_1 = JQVTJvmModelInferrer.this.eNull();
              final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
                  public void apply(final JvmConstructor it) {
                    String _name = relation.getName();
                    it.setSimpleName(_name);
                    Iterable<RelationDomain> _sourceDomains = JQVTJvmModelInferrer.this.getSourceDomains(relation);
                    for (final RelationDomain domain : _sourceDomains) {
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      EObject _eNull = JQVTJvmModelInferrer.this.eNull();
                      String _name_1 = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                      JvmTypeReference _type = JQVTJvmModelInferrer.this._jQVTUtils.getType(domain);
                      JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, _name_1, _type);
                      JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    }
                    EList<Adapter> _eAdapters = it.eAdapters();
                    _eAdapters.clear();
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          Iterable<RelationDomain> _sourceDomains = JQVTJvmModelInferrer.this.getSourceDomains(relation);
                          final Function1<RelationDomain,String> _function = new Function1<RelationDomain,String>() {
                              public String apply(final RelationDomain domain) {
                                StringConcatenation _builder = new StringConcatenation();
                                _builder.append("this.");
                                String _name = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                                _builder.append(_name, "");
                                _builder.append("=");
                                String _name_1 = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                                _builder.append(_name_1, "");
                                _builder.append(";");
                                return _builder.toString();
                              }
                            };
                          Iterable<String> _map = IterableExtensions.<RelationDomain, String>map(_sourceDomains, _function);
                          String _join = IterableExtensions.join(_map, "\n");
                          it.append(_join);
                        }
                      };
                    JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmConstructor _constructor = JQVTJvmModelInferrer.this._jvmTypesBuilder.toConstructor(_eNull_1, _function);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
              EList<JvmMember> _members_3 = it.getMembers();
              EObject _eNull_2 = JQVTJvmModelInferrer.this.eNull();
              JvmTypeReference _newTypeRef_1 = JQVTJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(relation, int.class);
              final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("if (hash != 0) return hash;");
                    _builder.newLine();
                    _builder.append("final int prime = 31;");
                    _builder.newLine();
                    _builder.append("int result = 1;");
                    _builder.newLine();
                    {
                      Iterable<RelationDomain> _sourceDomains = JQVTJvmModelInferrer.this.getSourceDomains(relation);
                      for(final RelationDomain domain : _sourceDomains) {
                        _builder.append("result = prime * result + ");
                        String _name = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                        _builder.append(_name, "");
                        _builder.append(".hashCode();");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("return hash = result;");
                    final String b = _builder.toString();
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          it.append(b);
                        }
                      };
                    JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method = JQVTJvmModelInferrer.this._jvmTypesBuilder.toMethod(_eNull_2, "hashCode", _newTypeRef_1, _function_1);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method);
              EList<JvmMember> _members_4 = it.getMembers();
              EObject _eNull_3 = JQVTJvmModelInferrer.this.eNull();
              JvmTypeReference _newTypeRef_2 = JQVTJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(relation, boolean.class);
              final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
                  public void apply(final JvmOperation it) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    EObject _eNull = JQVTJvmModelInferrer.this.eNull();
                    JvmTypeReference _newTypeRef = JQVTJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(relation, Object.class);
                    JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "obj", _newTypeRef);
                    JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                    StringConcatenation _builder = new StringConcatenation();
                    _builder.append("if (this == obj) return true;");
                    _builder.newLine();
                    _builder.append("if (!(obj instanceof ");
                    String _name = relation.getName();
                    _builder.append(_name, "");
                    _builder.append(")) return false;");
                    _builder.newLineIfNotEmpty();
                    String _name_1 = relation.getName();
                    _builder.append(_name_1, "");
                    _builder.append(" other = (");
                    String _name_2 = relation.getName();
                    _builder.append(_name_2, "");
                    _builder.append(") obj;");
                    _builder.newLineIfNotEmpty();
                    {
                      Iterable<RelationDomain> _sourceDomains = JQVTJvmModelInferrer.this.getSourceDomains(relation);
                      for(final RelationDomain domain : _sourceDomains) {
                        _builder.append("if (");
                        String _name_3 = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                        _builder.append(_name_3, "");
                        _builder.append(" != null ? !");
                        String _name_4 = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                        _builder.append(_name_4, "");
                        _builder.append(".equals(other.");
                        String _name_5 = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                        _builder.append(_name_5, "");
                        _builder.append(") :  other.");
                        String _name_6 = JQVTJvmModelInferrer.this._jQVTUtils.getName(domain);
                        _builder.append(_name_6, "");
                        _builder.append(" == null) return false;");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                    _builder.append("return true;");
                    final String b = _builder.toString();
                    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                        public void apply(final ITreeAppendable it) {
                          it.append(b);
                        }
                      };
                    JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
                  }
                };
              JvmOperation _method_1 = JQVTJvmModelInferrer.this._jvmTypesBuilder.toMethod(_eNull_3, "equals", _newTypeRef_2, _function_2);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_1);
            }
          };
        final JvmGenericType c = this._jvmTypesBuilder.toClass(relation, _fullyQualifiedName_1, _function_2);
        acceptor.<JvmGenericType>accept(c);
        StringConcatenation _stringConcatenation = new StringConcatenation();
        final StringConcatenation mapMethod = _stringConcatenation;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.trafo = transformation;");
        _builder.newLine();
        mapMethod.append(_builder);
        int i = 1;
        int nesting = 0;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("return false;");
        _builder_1.newLine();
        String stopTuple = _builder_1.toString();
        Map<String,XVariableDeclaration> _uniqueVars = this._dependencyProcessor.getUniqueVars(relation);
        Collection<XVariableDeclaration> _values = _uniqueVars.values();
        for (final XVariableDeclaration feature : _values) {
          {
            String _name_1 = feature.getName();
            JvmTypeReference _type_1 = feature.getType();
            final JvmField field = this._jvmTypesBuilder.toField(feature, _name_1, _type_1);
            this._jvmVisibilityExtension.makePublic(field);
            boolean _isSourceDomain = this._jQVTUtils.isSourceDomain(feature);
            field.setFinal(_isSourceDomain);
            EList<JvmMember> _members_1 = c.getMembers();
            this._jvmTypesBuilder.<JvmField>operator_add(_members_1, field);
          }
        }
        List<DependencyInfo> _sortSnippetsOfRelation = this._dependencyProcessor.sortSnippetsOfRelation(relation);
        for (final DependencyInfo info : _sortSnippetsOfRelation) {
          {
            final EObject clause = info.snippet;
            if (info.isTarget) {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("throw new RuntimeException(\"where clause of ");
              String _name_1 = relation.getName();
              _builder_2.append(_name_1, "");
              _builder_2.append(" failed!\");");
              _builder_2.newLineIfNotEmpty();
              stopTuple = _builder_2.toString();
            }
            boolean _matched = false;
            if (!_matched) {
              if (clause instanceof ObjectTemplate) {
                final ObjectTemplate _objectTemplate = (ObjectTemplate)clause;
                _matched=true;
                boolean _and = false;
                boolean _and_1 = false;
                boolean _and_2 = false;
                if (!info.isTarget) {
                  _and_2 = false;
                } else {
                  JvmTypeReference _type_1 = _objectTemplate.getType();
                  boolean _notEquals = (!Objects.equal(_type_1, null));
                  _and_2 = (info.isTarget && _notEquals);
                }
                if (!_and_2) {
                  _and_1 = false;
                } else {
                  JvmTypeReference _type_2 = _objectTemplate.getType();
                  JvmType _type_3 = _type_2.getType();
                  boolean _not = (!(_type_3 instanceof JvmPrimitiveType));
                  _and_1 = (_and_2 && _not);
                }
                if (!_and_1) {
                  _and = false;
                } else {
                  boolean _isWrite = info.isWrite(_objectTemplate);
                  _and = (_and_1 && _isWrite);
                }
                if (_and) {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("// ");
                  String _qVTWithinComment = JQVTUtils.toQVTWithinComment(_objectTemplate);
                  _builder_3.append(_qVTWithinComment, "");
                  _builder_3.newLineIfNotEmpty();
                  mapMethod.append(_builder_3);
                  StringConcatenation _builder_4 = new StringConcatenation();
                  {
                    boolean _or = false;
                    boolean _isRead = info.isRead(_objectTemplate);
                    if (_isRead) {
                      _or = true;
                    } else {
                      boolean _and_3 = false;
                      boolean _isRootTemplate = this._jQVTUtils.isRootTemplate(_objectTemplate);
                      if (!_isRootTemplate) {
                        _and_3 = false;
                      } else {
                        boolean _or_1 = false;
                        boolean _greaterEqualsThan = (nesting >= 1);
                        if (_greaterEqualsThan) {
                          _or_1 = true;
                        } else {
                          boolean _isTopRelation = relation.isTopRelation();
                          boolean _not_1 = (!_isTopRelation);
                          _or_1 = (_greaterEqualsThan || _not_1);
                        }
                        _and_3 = (_isRootTemplate && _or_1);
                      }
                      _or = (_isRead || _and_3);
                    }
                    if (_or) {
                      _builder_4.append("if (");
                      String _name_2 = _objectTemplate.getName();
                      _builder_4.append(_name_2, "");
                      _builder_4.append("==null) ");
                    }
                  }
                  String _name_3 = _objectTemplate.getName();
                  _builder_4.append(_name_3, "");
                  _builder_4.append(" = transformation.create(");
                  String _simpleTypeName = this.simpleTypeName(_objectTemplate);
                  _builder_4.append(_simpleTypeName, "");
                  _builder_4.append(".class);");
                  _builder_4.newLineIfNotEmpty();
                  mapMethod.append(_builder_4);
                }
              }
            }
            if (!_matched) {
              if (clause instanceof PropertyTemplateItem) {
                final PropertyTemplateItem _propertyTemplateItem = (PropertyTemplateItem)clause;
                _matched=true;
                EObject _eContainer_1 = _propertyTemplateItem.eContainer();
                final ObjectTemplate objectTemplate = ((ObjectTemplate) _eContainer_1);
                boolean _and = false;
                JvmOperation _referredProperty = _propertyTemplateItem.getReferredProperty();
                boolean _notEquals = (!Objects.equal(_referredProperty, null));
                if (!_notEquals) {
                  _and = false;
                } else {
                  JvmOperation _referredProperty_1 = _propertyTemplateItem.getReferredProperty();
                  String _simpleName = _referredProperty_1.getSimpleName();
                  boolean _notEquals_1 = (!Objects.equal(_simpleName, null));
                  _and = (_notEquals && _notEquals_1);
                }
                if (_and) {
                  final JvmOperation field = _propertyTemplateItem.getReferredProperty();
                  JvmOperation _referredProperty_2 = _propertyTemplateItem.getReferredProperty();
                  String _simpleName_1 = _referredProperty_2.getSimpleName();
                  String _substring = _simpleName_1.substring(3);
                  final String propName = StringExtensions.toFirstUpper(_substring);
                  JvmTypeReference _returnType = field.getReturnType();
                  final boolean isMany = this._jQVTUtils.isMany(_returnType);
                  String rhsExp = "unknown";
                  XExpression _value = _propertyTemplateItem.getValue();
                  XVariableDeclaration _asVar = this._jQVTUtils.asVar(_value);
                  boolean _notEquals_2 = (!Objects.equal(_asVar, null));
                  if (_notEquals_2) {
                    XExpression _value_1 = _propertyTemplateItem.getValue();
                    XVariableDeclaration _asVar_1 = this._jQVTUtils.asVar(_value_1);
                    String _name_2 = _asVar_1.getName();
                    rhsExp = _name_2;
                  } else {
                    String _plus = ("evaluateExpression" + Integer.valueOf(i));
                    String _plus_1 = (_plus + "()");
                    rhsExp = _plus_1;
                    EList<JvmMember> _members_1 = c.getMembers();
                    EObject _eNull = this.eNull();
                    String _plus_2 = ("evaluateExpression" + Integer.valueOf(i));
                    JvmTypeReference _returnType_1 = field.getReturnType();
                    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                        public void apply(final JvmOperation it) {
                          XExpression _value = _propertyTemplateItem.getValue();
                          JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _value);
                        }
                      };
                    JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_eNull, _plus_2, _returnType_1, _function_3);
                    this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
                  }
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("// ");
                  String _firstLower = StringExtensions.toFirstLower(propName);
                  _builder_3.append(_firstLower, "");
                  _builder_3.append(" = ");
                  XExpression _value_2 = _propertyTemplateItem.getValue();
                  String _qVTWithinComment = JQVTUtils.toQVTWithinComment(_value_2);
                  _builder_3.append(_qVTWithinComment, "");
                  _builder_3.newLineIfNotEmpty();
                  mapMethod.append(_builder_3);
                  if (info.isTarget) {
                    boolean _and_1 = false;
                    if (!isMany) {
                      _and_1 = false;
                    } else {
                      XExpression _value_3 = _propertyTemplateItem.getValue();
                      _and_1 = (isMany && (_value_3 instanceof ObjectTemplate));
                    }
                    if (_and_1) {
                      StringConcatenation _builder_4 = new StringConcatenation();
                      String _name_3 = objectTemplate.getName();
                      _builder_4.append(_name_3, "");
                      _builder_4.append(".get");
                      _builder_4.append(propName, "");
                      _builder_4.append("().add(");
                      _builder_4.append(rhsExp, "");
                      _builder_4.append(");");
                      _builder_4.newLineIfNotEmpty();
                      mapMethod.append(_builder_4);
                    } else {
                      if (isMany) {
                        StringConcatenation _builder_5 = new StringConcatenation();
                        String _name_4 = objectTemplate.getName();
                        _builder_5.append(_name_4, "");
                        _builder_5.append(".get");
                        _builder_5.append(propName, "");
                        _builder_5.append("().retainAll(");
                        _builder_5.append(rhsExp, "");
                        _builder_5.append(");");
                        _builder_5.newLineIfNotEmpty();
                        String _name_5 = objectTemplate.getName();
                        _builder_5.append(_name_5, "");
                        _builder_5.append(".get");
                        _builder_5.append(propName, "");
                        _builder_5.append("().addAll(");
                        _builder_5.append(rhsExp, "");
                        _builder_5.append(");");
                        _builder_5.newLineIfNotEmpty();
                        mapMethod.append(_builder_5);
                      } else {
                        StringConcatenation _builder_6 = new StringConcatenation();
                        String _name_6 = objectTemplate.getName();
                        _builder_6.append(_name_6, "");
                        _builder_6.append(".set");
                        _builder_6.append(propName, "");
                        _builder_6.append("(");
                        _builder_6.append(rhsExp, "");
                        _builder_6.append(");");
                        _builder_6.newLineIfNotEmpty();
                        mapMethod.append(_builder_6);
                      }
                    }
                  } else {
                    boolean _and_2 = false;
                    XExpression _value_4 = _propertyTemplateItem.getValue();
                    if (!(_value_4 instanceof ObjectTemplate)) {
                      _and_2 = false;
                    } else {
                      _and_2 = ((_value_4 instanceof ObjectTemplate) && isMany);
                    }
                    if (_and_2) {
                      int _plus_3 = (nesting + 1);
                      nesting = _plus_3;
                      boolean _equals = (nesting == 1);
                      if (_equals) {
                        StringConcatenation _builder_7 = new StringConcatenation();
                        _builder_7.append("boolean result = false;");
                        _builder_7.newLine();
                        mapMethod.append(_builder_7);
                      }
                      StringConcatenation _builder_8 = new StringConcatenation();
                      _builder_8.append("continue;");
                      _builder_8.newLine();
                      stopTuple = _builder_8.toString();
                      XExpression _value_5 = _propertyTemplateItem.getValue();
                      final ObjectTemplate rhs = ((ObjectTemplate) _value_5);
                      JvmTypeReference _returnType_2 = field.getReturnType();
                      final JvmTypeReference componentType = this._jQVTUtils.getComponentType(_returnType_2);
                      JvmTypeReference _type_1 = rhs.getType();
                      final boolean conformant = this._jvmOnlyTypeConformanceComputer.isConformant(_type_1, componentType);
                      StringConcatenation _builder_9 = new StringConcatenation();
                      _builder_9.append("for (");
                      String _qualifiedName = componentType.getQualifiedName();
                      _builder_9.append(_qualifiedName, "");
                      _builder_9.append(" __");
                      String _name_7 = rhs.getName();
                      _builder_9.append(_name_7, "");
                      _builder_9.append(" : ");
                      String _name_8 = objectTemplate.getName();
                      _builder_9.append(_name_8, "");
                      _builder_9.append(".get");
                      _builder_9.append(propName, "");
                      _builder_9.append("()) {");
                      _builder_9.newLineIfNotEmpty();
                      {
                        boolean _not = (!conformant);
                        if (_not) {
                          _builder_9.append("if (!(__");
                          String _name_9 = rhs.getName();
                          _builder_9.append(_name_9, "");
                          _builder_9.append(" instanceof ");
                          String _simpleTypeName = this.simpleTypeName(rhs);
                          _builder_9.append(_simpleTypeName, "");
                          _builder_9.append(")) ");
                          _builder_9.append(stopTuple, "");
                        }
                      }
                      _builder_9.newLineIfNotEmpty();
                      String _name_10 = rhs.getName();
                      _builder_9.append(_name_10, "");
                      _builder_9.append(" = ");
                      {
                        boolean _not_1 = (!conformant);
                        if (_not_1) {
                          _builder_9.append("(");
                          String _simpleTypeName_1 = this.simpleTypeName(rhs);
                          _builder_9.append(_simpleTypeName_1, "");
                          _builder_9.append(")");
                        }
                      }
                      _builder_9.append("__");
                      String _name_11 = rhs.getName();
                      _builder_9.append(_name_11, "");
                      _builder_9.append(";");
                      _builder_9.newLineIfNotEmpty();
                      mapMethod.append(_builder_9);
                    } else {
                      boolean _and_3 = false;
                      boolean _and_4 = false;
                      XExpression _value_6 = _propertyTemplateItem.getValue();
                      XVariableDeclaration _asVar_2 = this._jQVTUtils.asVar(_value_6);
                      boolean _notEquals_3 = (!Objects.equal(_asVar_2, null));
                      if (!_notEquals_3) {
                        _and_4 = false;
                      } else {
                        XExpression _value_7 = _propertyTemplateItem.getValue();
                        XVariableDeclaration _asVar_3 = this._jQVTUtils.asVar(_value_7);
                        boolean _isWrite = info.isWrite(_asVar_3);
                        _and_4 = (_notEquals_3 && _isWrite);
                      }
                      if (!_and_4) {
                        _and_3 = false;
                      } else {
                        XExpression _value_8 = _propertyTemplateItem.getValue();
                        XVariableDeclaration _asVar_4 = this._jQVTUtils.asVar(_value_8);
                        boolean _isRead = info.isRead(_asVar_4);
                        boolean _not_2 = (!_isRead);
                        _and_3 = (_and_4 && _not_2);
                      }
                      if (_and_3) {
                        XExpression _value_9 = _propertyTemplateItem.getValue();
                        final XVariableDeclaration rhs_1 = this._jQVTUtils.asVar(_value_9);
                        JvmTypeReference _type_2 = rhs_1.getType();
                        JvmTypeReference _returnType_3 = field.getReturnType();
                        final boolean conformant_1 = this._jvmOnlyTypeConformanceComputer.isConformant(_type_2, _returnType_3);
                        StringConcatenation _builder_10 = new StringConcatenation();
                        {
                          boolean _not_3 = (!conformant_1);
                          if (_not_3) {
                            _builder_10.append("if (!(");
                            String _name_12 = objectTemplate.getName();
                            _builder_10.append(_name_12, "");
                            _builder_10.append(".get");
                            _builder_10.append(propName, "");
                            _builder_10.append("() instanceof ");
                            String _simpleTypeName_2 = this.simpleTypeName(rhs_1);
                            _builder_10.append(_simpleTypeName_2, "");
                            _builder_10.append(")) ");
                            _builder_10.append(stopTuple, "");
                          }
                        }
                        _builder_10.newLineIfNotEmpty();
                        {
                          boolean _and_5 = false;
                          if (!conformant_1) {
                            _and_5 = false;
                          } else {
                            boolean _or = false;
                            XExpression _value_10 = _propertyTemplateItem.getValue();
                            if ((_value_10 instanceof ObjectTemplate)) {
                              _or = true;
                            } else {
                              boolean _and_6 = false;
                              JvmTypeReference _type_3 = rhs_1.getType();
                              JvmType _type_4 = _type_3.getType();
                              if (!(_type_4 instanceof JvmPrimitiveType)) {
                                _and_6 = false;
                              } else {
                                JvmTypeReference _returnType_4 = field.getReturnType();
                                JvmType _type_5 = _returnType_4.getType();
                                boolean _not_4 = (!(_type_5 instanceof JvmPrimitiveType));
                                _and_6 = ((_type_4 instanceof JvmPrimitiveType) && _not_4);
                              }
                              _or = ((_value_10 instanceof ObjectTemplate) || _and_6);
                            }
                            _and_5 = (conformant_1 && _or);
                          }
                          if (_and_5) {
                            _builder_10.append("if (");
                            String _name_13 = objectTemplate.getName();
                            _builder_10.append(_name_13, "");
                            _builder_10.append(".get");
                            _builder_10.append(propName, "");
                            _builder_10.append("() == null) ");
                            _builder_10.append(stopTuple, "");
                          }
                        }
                        _builder_10.newLineIfNotEmpty();
                        String _name_14 = rhs_1.getName();
                        _builder_10.append(_name_14, "");
                        _builder_10.append(" = ");
                        {
                          boolean _not_5 = (!conformant_1);
                          if (_not_5) {
                            _builder_10.append("(");
                            String _simpleTypeName_3 = this.simpleTypeName(rhs_1);
                            _builder_10.append(_simpleTypeName_3, "");
                            _builder_10.append(")");
                          }
                        }
                        _builder_10.append(" ");
                        String _name_15 = objectTemplate.getName();
                        _builder_10.append(_name_15, "");
                        _builder_10.append(".get");
                        _builder_10.append(propName, "");
                        _builder_10.append("();");
                        _builder_10.newLineIfNotEmpty();
                        mapMethod.append(_builder_10);
                      } else {
                        StringConcatenation _builder_11 = new StringConcatenation();
                        _builder_11.append("if (");
                        String _name_16 = objectTemplate.getName();
                        _builder_11.append(_name_16, "");
                        _builder_11.append(".get");
                        _builder_11.append(propName, "");
                        _builder_11.append("() == null ? ");
                        _builder_11.append(rhsExp, "");
                        _builder_11.append(" != null : !");
                        String _name_17 = objectTemplate.getName();
                        _builder_11.append(_name_17, "");
                        _builder_11.append(".get");
                        _builder_11.append(propName, "");
                        _builder_11.append("().equals(");
                        _builder_11.append(rhsExp, "");
                        _builder_11.append(")) ");
                        _builder_11.append(stopTuple, "");
                        _builder_11.newLineIfNotEmpty();
                        mapMethod.append(_builder_11);
                      }
                    }
                  }
                }
              }
            }
            if (!_matched) {
              if (clause instanceof XExpression) {
                final XExpression _xExpression = (XExpression)clause;
                _matched=true;
                boolean _and = false;
                boolean _not = (!info.isTarget);
                if (!_not) {
                  _and = false;
                } else {
                  boolean _not_1 = (!(_xExpression instanceof XAssignment));
                  _and = (_not && _not_1);
                }
                final boolean booleanTyped = _and;
                EList<JvmMember> _members_1 = c.getMembers();
                EObject _eNull = this.eNull();
                String _plus = ("evaluateClause" + Integer.valueOf(i));
                JvmTypeReference _xifexpression = null;
                if (booleanTyped) {
                  JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(relation, boolean.class);
                  _xifexpression = _newTypeRef;
                } else {
                  JvmTypeReference _newTypeRef_1 = this._jvmTypesBuilder.newTypeRef(relation, Void.TYPE);
                  _xifexpression = _newTypeRef_1;
                }
                final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
                    public void apply(final JvmOperation it) {
                      JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _xExpression);
                    }
                  };
                JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_eNull, _plus, _xifexpression, _function_3);
                this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
                StringConcatenation _builder_3 = new StringConcatenation();
                _builder_3.append("// ");
                String _qVTWithinComment = JQVTUtils.toQVTWithinComment(_xExpression);
                _builder_3.append(_qVTWithinComment, "");
                _builder_3.newLineIfNotEmpty();
                {
                  if (booleanTyped) {
                    _builder_3.append("if (!evaluateClause");
                    _builder_3.append(i, "");
                    _builder_3.append("()) ");
                    _builder_3.append(stopTuple, "");
                  } else {
                    _builder_3.append("evaluateClause");
                    _builder_3.append(i, "");
                    _builder_3.append("();");
                  }
                }
                _builder_3.newLineIfNotEmpty();
                mapMethod.append(_builder_3);
              }
            }
            int _plus = (i + 1);
            i = _plus;
          }
        }
        boolean _greaterThan = (nesting > 0);
        if (_greaterThan) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("result=true;");
          _builder_2.newLine();
          mapMethod.append(_builder_2);
        }
        int _nesting = 0;
        boolean _lessThan = (_nesting < nesting);
        boolean _while = _lessThan;
        while (_while) {
          {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("}");
            _builder_3.newLine();
            mapMethod.append(_builder_3);
            int _plus = (_nesting + 1);
            _nesting = _plus;
          }
          boolean _lessThan_1 = (_nesting < nesting);
          _while = _lessThan_1;
        }
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("return ");
        {
          boolean _greaterThan_1 = (nesting > 0);
          if (_greaterThan_1) {
            _builder_3.append("result");
          } else {
            _builder_3.append("true");
          }
        }
        _builder_3.append(";");
        mapMethod.append(_builder_3);
        EList<JvmMember> _members_1 = c.getMembers();
        EObject _eNull = this.eNull();
        JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(relation, boolean.class);
        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = JQVTJvmModelInferrer.this.eNull();
              JvmParameterizedTypeReference _createTypeRef = JQVTJvmModelInferrer.this._typeReferences.createTypeRef(trafoType);
              JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "transformation", _createTypeRef);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                  public void apply(final ITreeAppendable it) {
                    it.append(mapMethod);
                  }
                };
              JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          };
        JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(_eNull, "execute", _newTypeRef, _function_3);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
      }
    }
    EList<Relation> _rules_1 = transformation.getRules();
    for (final Relation relation_1 : _rules_1) {
      EList<JvmMember> _members_1 = trafoType.getMembers();
      String _name_1 = relation_1.getName();
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(relation_1, boolean.class);
      final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            Iterable<RelationDomain> _uniqueDomains = JQVTJvmModelInferrer.this._jQVTUtils.getUniqueDomains(relation_1);
            for (final RelationDomain domain : _uniqueDomains) {
              EList<JvmFormalParameter> _parameters = it.getParameters();
              EObject _eNull = JQVTJvmModelInferrer.this.eNull();
              String _paramName = JQVTJvmModelInferrer.this.getParamName(domain);
              JvmTypeReference _newTypeRef = JQVTJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(domain, Object.class);
              JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, _paramName, _newTypeRef);
              JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            }
            String _documentation = JQVTJvmModelInferrer.this._jvmTypesBuilder.getDocumentation(relation_1);
            JQVTJvmModelInferrer.this._jvmTypesBuilder.setDocumentation(it, _documentation);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("throw new RuntimeException(\"should never be called\");");
                  it.append(_builder);
                }
              };
            JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(relation_1, _name_1, _newTypeRef, _function_2);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method_1);
    }
    List<Relation> _sortedRelations = this._dependencyProcessor.getSortedRelations(transformation);
    for (final Relation relation_2 : _sortedRelations) {
      {
        final JvmDeclaredType c = this._jQVTUtils.getTypeForRelation(relation_2);
        final JvmParameterizedTypeReference relationType = this._typeReferences.createTypeRef(c);
        JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(c);
        JvmParameterizedTypeReference _createTypeRef_1 = this._typeReferences.createTypeRef(c);
        final JvmTypeReference hashMap = this._jvmTypesBuilder.newTypeRef(relation_2, "java.util.HashMap", _createTypeRef, _createTypeRef_1);
        EObject _eNull = this.eNull();
        String _tracesName = this.tracesName(relation_2);
        final JvmField traceField = this._jvmTypesBuilder.toField(_eNull, _tracesName, hashMap);
        this._jvmVisibilityExtension.makePublic(traceField);
        EList<JvmMember> _members_2 = trafoType.getMembers();
        this._jvmTypesBuilder.<JvmField>operator_add(_members_2, traceField);
        EList<JvmMember> _members_3 = trafoType.getMembers();
        EObject _eNull_1 = this.eNull();
        String _xifexpression = null;
        boolean _isTopRelation = relation_2.isTopRelation();
        if (_isTopRelation) {
          _xifexpression = "top_relation_";
        } else {
          _xifexpression = "push_relation_";
        }
        String _name_2 = relation_2.getName();
        String _plus = (_xifexpression + _name_2);
        final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              Iterable<RelationDomain> _uniqueDomains = JQVTJvmModelInferrer.this._jQVTUtils.getUniqueDomains(relation_2);
              for (final RelationDomain domain : _uniqueDomains) {
                boolean _or = false;
                boolean _isTopRelation = relation_2.isTopRelation();
                boolean _not = (!_isTopRelation);
                if (_not) {
                  _or = true;
                } else {
                  boolean _isTarget = JQVTJvmModelInferrer.this._jQVTUtils.isTarget(domain);
                  boolean _not_1 = (!_isTarget);
                  _or = (_not || _not_1);
                }
                if (_or) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  EObject _eNull = JQVTJvmModelInferrer.this.eNull();
                  String _paramName = JQVTJvmModelInferrer.this.getParamName(domain);
                  JvmTypeReference _type = JQVTJvmModelInferrer.this._jQVTUtils.getType(domain);
                  JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, _paramName, _type);
                  JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                }
              }
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                  public void apply(final ITreeAppendable it) {
                    String _relBody = JQVTJvmModelInferrer.this.relBody(relation_2, true, false);
                    it.append(_relBody);
                  }
                };
              JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
            }
          };
        JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(_eNull_1, _plus, relationType, _function_3);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_2);
        boolean _isTopRelation_1 = relation_2.isTopRelation();
        boolean _not = (!_isTopRelation_1);
        if (_not) {
          EList<JvmMember> _members_4 = trafoType.getMembers();
          EObject _eNull_2 = this.eNull();
          String _name_3 = relation_2.getName();
          String _plus_1 = ("relation_" + _name_3);
          final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                Iterable<RelationDomain> _uniqueDomains = JQVTJvmModelInferrer.this._jQVTUtils.getUniqueDomains(relation_2);
                for (final RelationDomain domain : _uniqueDomains) {
                  boolean _isTarget = JQVTJvmModelInferrer.this._jQVTUtils.isTarget(domain);
                  boolean _not = (!_isTarget);
                  if (_not) {
                    EList<JvmFormalParameter> _parameters = it.getParameters();
                    EObject _eNull = JQVTJvmModelInferrer.this.eNull();
                    String _paramName = JQVTJvmModelInferrer.this.getParamName(domain);
                    JvmTypeReference _type = JQVTJvmModelInferrer.this._jQVTUtils.getType(domain);
                    JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, _paramName, _type);
                    JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                  }
                }
                final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                    public void apply(final ITreeAppendable it) {
                      String _relBody = JQVTJvmModelInferrer.this.relBody(relation_2, true, true);
                      it.append(_relBody);
                    }
                  };
                JQVTJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _function);
              }
            };
          JvmOperation _method_3 = this._jvmTypesBuilder.toMethod(_eNull_2, _plus_1, relationType, _function_4);
          this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_3);
        }
      }
    }
    final JvmTypeParameter T = TypesFactory.eINSTANCE.createJvmTypeParameter();
    T.setName("T");
    final JvmParameterizedTypeReference returnT = this._typeReferences.createTypeRef(T);
    EList<JvmMember> _members_2 = trafoType.getMembers();
    EObject _eNull = this.eNull();
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          EList<JvmTypeParameter> _typeParameters = it.getTypeParameters();
          JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeParameter>operator_add(_typeParameters, T);
          EList<JvmFormalParameter> _parameters = it.getParameters();
          EObject _eNull = JQVTJvmModelInferrer.this.eNull();
          JvmTypeReference _newTypeRef = JQVTJvmModelInferrer.this._jvmTypesBuilder.newTypeRef(transformation, Class.class, returnT);
          JvmFormalParameter _parameter = JQVTJvmModelInferrer.this._jvmTypesBuilder.toParameter(_eNull, "c", _newTypeRef);
          JQVTJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          it.setAbstract(true);
        }
      };
    JvmOperation _method_2 = this._jvmTypesBuilder.toMethod(_eNull, "create", returnT, _function_3);
    this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method_2);
  }
  
  public void infer(final EObject transformation, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (transformation instanceof Transformation) {
      _infer((Transformation)transformation, acceptor, isPrelinkingPhase);
      return;
    } else if (transformation != null) {
      _infer(transformation, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(transformation, acceptor, isPrelinkingPhase).toString());
    }
  }
}
