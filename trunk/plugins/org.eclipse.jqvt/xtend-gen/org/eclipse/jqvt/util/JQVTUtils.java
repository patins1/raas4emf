/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jqvt.jQVT.Direction;
import org.eclipse.jqvt.jQVT.ObjectTemplate;
import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.RelationDomain;
import org.eclipse.jqvt.jQVT.Transformation;
import org.eclipse.jqvt.jvmmodel.ParamPair;
import org.eclipse.jqvt.util.JQVTUtilsExtended;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.typing.JvmOnlyTypeConformanceComputer;

/**
 * Some utility methods
 */
@SuppressWarnings("all")
public class JQVTUtils {
  @Inject
  @Extension
  private JvmOnlyTypeConformanceComputer _jvmOnlyTypeConformanceComputer;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public Iterable<RelationDomain> getUniqueDomains(final Relation relation) {
    HashSet<String> _hashSet = new HashSet<String>();
    final HashSet<String> names = _hashSet;
    EList<RelationDomain> _domains = relation.getDomains();
    final Function1<RelationDomain,Boolean> _function = new Function1<RelationDomain,Boolean>() {
        public Boolean apply(final RelationDomain domain) {
          boolean _and = false;
          boolean _isTarget = JQVTUtils.this.isTarget(domain);
          boolean _not = (!_isTarget);
          if (!_not) {
            _and = false;
          } else {
            String _name = JQVTUtils.this.getName(domain);
            boolean _add = names.add(_name);
            _and = (_not && _add);
          }
          return Boolean.valueOf(_and);
        }
      };
    Iterable<RelationDomain> _filter = IterableExtensions.<RelationDomain>filter(_domains, _function);
    EList<RelationDomain> _domains_1 = relation.getDomains();
    final Function1<RelationDomain,Boolean> _function_1 = new Function1<RelationDomain,Boolean>() {
        public Boolean apply(final RelationDomain domain) {
          boolean _and = false;
          boolean _isTarget = JQVTUtils.this.isTarget(domain);
          if (!_isTarget) {
            _and = false;
          } else {
            String _name = JQVTUtils.this.getName(domain);
            boolean _add = names.add(_name);
            _and = (_isTarget && _add);
          }
          return Boolean.valueOf(_and);
        }
      };
    Iterable<RelationDomain> _filter_1 = IterableExtensions.<RelationDomain>filter(_domains_1, _function_1);
    return Iterables.<RelationDomain>concat(_filter, _filter_1);
  }
  
  public String getName(final RelationDomain domain) {
    XVariableDeclaration _rootTemplate = domain.getRootTemplate();
    String _name = _rootTemplate.getName();
    return _name;
  }
  
  public JvmTypeReference getType(final RelationDomain domain) {
    XVariableDeclaration _rootTemplate = domain.getRootTemplate();
    JvmTypeReference _type = _rootTemplate.getType();
    return _type;
  }
  
  public Iterable<ParamPair> getParamPairs(final XFeatureCall call, final Boolean isTarget) {
    final Relation relation = this.getReferredRelation(call);
    Iterable<RelationDomain> _uniqueDomains = this.getUniqueDomains(relation);
    final Function1<RelationDomain,Boolean> _function = new Function1<RelationDomain,Boolean>() {
        public Boolean apply(final RelationDomain domain) {
          boolean _and = false;
          boolean _or = false;
          boolean _equals = Objects.equal(isTarget, null);
          if (_equals) {
            _or = true;
          } else {
            boolean _isTarget = JQVTUtils.this.isTarget(domain);
            boolean _equals_1 = isTarget.equals(Boolean.valueOf(_isTarget));
            _or = (_equals || _equals_1);
          }
          if (!_or) {
            _and = false;
          } else {
            Iterable<RelationDomain> _uniqueDomains = JQVTUtils.this.getUniqueDomains(relation);
            List<RelationDomain> _list = IterableExtensions.<RelationDomain>toList(_uniqueDomains);
            int _indexOf = _list.indexOf(domain);
            EList<XExpression> _featureCallArguments = call.getFeatureCallArguments();
            int _size = _featureCallArguments.size();
            boolean _lessThan = (_indexOf < _size);
            _and = (_or && _lessThan);
          }
          return Boolean.valueOf(_and);
        }
      };
    Iterable<RelationDomain> _filter = IterableExtensions.<RelationDomain>filter(_uniqueDomains, _function);
    final Function1<RelationDomain,ParamPair> _function_1 = new Function1<RelationDomain,ParamPair>() {
        public ParamPair apply(final RelationDomain domain) {
          EList<XExpression> _featureCallArguments = call.getFeatureCallArguments();
          Iterable<RelationDomain> _uniqueDomains = JQVTUtils.this.getUniqueDomains(relation);
          List<RelationDomain> _list = IterableExtensions.<RelationDomain>toList(_uniqueDomains);
          int _indexOf = _list.indexOf(domain);
          XExpression _get = _featureCallArguments.get(_indexOf);
          ParamPair _paramPair = new ParamPair(_get, domain);
          return _paramPair;
        }
      };
    return IterableExtensions.<RelationDomain, ParamPair>map(_filter, _function_1);
  }
  
  public JvmDeclaredType getTypeForRelation(final Relation relation) {
    Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(relation);
    Iterable<JvmDeclaredType> _filter = Iterables.<JvmDeclaredType>filter(_jvmElements, JvmDeclaredType.class);
    return IterableExtensions.<JvmDeclaredType>head(_filter);
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
  
  public boolean isTarget(final RelationDomain domain) {
    Direction _direction = domain.getDirection();
    Direction _target = this.getTarget(domain);
    boolean _equals = Objects.equal(_direction, _target);
    return _equals;
  }
  
  public boolean isSourceDomain(final XVariableDeclaration varDecl) {
    boolean _and = false;
    boolean _and_1 = false;
    if (!(varDecl instanceof ObjectTemplate)) {
      _and_1 = false;
    } else {
      EObject _eContainer = varDecl.eContainer();
      _and_1 = ((varDecl instanceof ObjectTemplate) && (_eContainer instanceof RelationDomain));
    }
    if (!_and_1) {
      _and = false;
    } else {
      EObject _eContainer_1 = varDecl.eContainer();
      boolean _isTarget = this.isTarget(((RelationDomain) _eContainer_1));
      boolean _not = (!_isTarget);
      _and = (_and_1 && _not);
    }
    return _and;
  }
  
  public Iterable<XVariableDeclaration> getAllVarDecls(final Relation relation) {
    TreeIterator<EObject> _eAllContents = relation.eAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
    Iterable<XVariableDeclaration> _filter = Iterables.<XVariableDeclaration>filter(_iterable, XVariableDeclaration.class);
    return _filter;
  }
  
  public Relation getOuterRelation(final EObject value) {
    Iterable<EObject> _containerIterable = JQVTUtilsExtended.getContainerIterable(value);
    Iterable<Relation> _filter = Iterables.<Relation>filter(_containerIterable, Relation.class);
    Relation _head = IterableExtensions.<Relation>head(_filter);
    return _head;
  }
  
  public Transformation getOuterTransformation(final EObject value) {
    Iterable<EObject> _containerIterable = JQVTUtilsExtended.getContainerIterable(value);
    Iterable<Transformation> _filter = Iterables.<Transformation>filter(_containerIterable, Transformation.class);
    Transformation _head = IterableExtensions.<Transformation>head(_filter);
    return _head;
  }
  
  public XVariableDeclaration findVarDecl(final EObject eObject, final String name) {
    Relation _outerRelation = this.getOuterRelation(eObject);
    Iterable<XVariableDeclaration> _allVarDecls = _outerRelation==null?(Iterable<XVariableDeclaration>)null:this.getAllVarDecls(_outerRelation);
    final Function1<XVariableDeclaration,Boolean> _function = new Function1<XVariableDeclaration,Boolean>() {
        public Boolean apply(final XVariableDeclaration x) {
          String _name = x.getName();
          boolean _equals = name.equals(_name);
          return Boolean.valueOf(_equals);
        }
      };
    XVariableDeclaration _findFirst = IterableExtensions.<XVariableDeclaration>findFirst(_allVarDecls, _function);
    return _findFirst;
  }
  
  public Relation getReferredRelation(final XAbstractFeatureCall xFeatureCall) {
    final String name = xFeatureCall.getConcreteSyntaxFeatureName();
    Transformation _outerTransformation = this.getOuterTransformation(xFeatureCall);
    EList<Relation> _rules = _outerTransformation==null?(EList<Relation>)null:_outerTransformation.getRules();
    final Function1<Relation,Boolean> _function = new Function1<Relation,Boolean>() {
        public Boolean apply(final Relation x) {
          String _name = x.getName();
          boolean _equals = name.equals(_name);
          return Boolean.valueOf(_equals);
        }
      };
    return IterableExtensions.<Relation>findFirst(_rules, _function);
  }
  
  public XVariableDeclaration asVar(final EObject eObject) {
    XVariableDeclaration _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (eObject instanceof XAssignment) {
        final XAssignment _xAssignment = (XAssignment)eObject;
        _matched=true;
        String _concreteSyntaxFeatureName = _xAssignment.getConcreteSyntaxFeatureName();
        XVariableDeclaration _findVarDecl = this.findVarDecl(_xAssignment, _concreteSyntaxFeatureName);
        _switchResult = _findVarDecl;
      }
    }
    if (!_matched) {
      if (eObject instanceof XFeatureCall) {
        final XFeatureCall _xFeatureCall = (XFeatureCall)eObject;
        _matched=true;
        XVariableDeclaration _xifexpression = null;
        JvmIdentifiableElement _feature = _xFeatureCall.getFeature();
        if ((_feature instanceof JvmOperation)) {
          _xifexpression = null;
        } else {
          String _concreteSyntaxFeatureName = _xFeatureCall.getConcreteSyntaxFeatureName();
          XVariableDeclaration _findVarDecl = this.findVarDecl(_xFeatureCall, _concreteSyntaxFeatureName);
          _xifexpression = _findVarDecl;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (eObject instanceof ObjectTemplate) {
        final ObjectTemplate _objectTemplate = (ObjectTemplate)eObject;
        _matched=true;
        _switchResult = _objectTemplate;
      }
    }
    return _switchResult;
  }
  
  public Direction getTarget(final EObject eObject) {
    Iterable<EObject> _containerIterable = JQVTUtilsExtended.getContainerIterable(eObject);
    Iterable<Transformation> _filter = Iterables.<Transformation>filter(_containerIterable, Transformation.class);
    Transformation _head = IterableExtensions.<Transformation>head(_filter);
    EList<Direction> _directions = _head==null?(EList<Direction>)null:_head.getDirections();
    Direction _last = IterableExtensions.<Direction>last(_directions);
    return _last;
  }
  
  public boolean isRootTemplate(final EObject objectTemplate) {
    EObject _eContainer = objectTemplate.eContainer();
    return (_eContainer instanceof RelationDomain);
  }
  
  public JvmTypeReference getComponentType(final JvmTypeReference type) {
    JvmTypeReference _xifexpression = null;
    if ((type instanceof JvmParameterizedTypeReference)) {
      EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference) type).getArguments();
      JvmTypeReference _get = _arguments.get(0);
      _xifexpression = _get;
    } else {
      JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(type, Object.class);
      _xifexpression = _newTypeRef;
    }
    return _xifexpression;
  }
  
  public boolean isMany(final JvmTypeReference type) {
    boolean _or = false;
    JvmTypeReference _newTypeRef = this._jvmTypesBuilder.newTypeRef(type, Collection.class);
    boolean _isConformant = this._jvmOnlyTypeConformanceComputer.isConformant(_newTypeRef, type, true);
    if (_isConformant) {
      _or = true;
    } else {
      _or = (_isConformant || (type instanceof JvmGenericArrayTypeReference));
    }
    return _or;
  }
  
  public static String toQVT(final EObject clause) {
    boolean _equals = Objects.equal(clause, null);
    if (_equals) {
      return "null";
    }
    if ((clause instanceof ObjectTemplate)) {
      final ObjectTemplate objectTemplate = ((ObjectTemplate) clause);
      String _name = objectTemplate.getName();
      String _plus = (_name + " : ");
      String _xifexpression = null;
      JvmTypeReference _type = objectTemplate.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        JvmTypeReference _type_1 = objectTemplate.getType();
        String _simpleName = _type_1.getSimpleName();
        _xifexpression = _simpleName;
      } else {
        _xifexpression = "unknown_type";
      }
      String _plus_1 = (_plus + _xifexpression);
      return (_plus_1 + " {..}");
    }
    try {
      Resource _eResource = clause.eResource();
      ISerializer _serializer = ((XtextResource) _eResource).getSerializer();
      String _serialize = _serializer.serialize(clause);
      return _serialize.trim();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _message = e.getMessage();
        return ("Error occured: " + _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static String toQVTWithinComment(final EObject clause) {
    String _qVT = JQVTUtils.toQVT(clause);
    String _trim = _qVT.trim();
    String _replace = _trim.replace("\n", "\n// ");
    return _replace.replace("\r", "");
  }
}
