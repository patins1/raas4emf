/**
 * Copyright (c) 2015, 2016 Joerg Kiegeland, Distributed Models Pty Ltd, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

using System;
using System.Collections.Generic;
using System.Text;
using System.Reflection;

namespace ocltransformation
{

    /// <summary>
    /// This class contains helper functions to evaluate the .NET equivalents of the OCL expressions
    /// </summary>
    public class OCLTransformationHelper
    {

        /// For a singleton set, returns the one and only element
        static public T One<T>(T item)
        {
            return item;
        }

        /// For a singleton set, returns the one and only element
        static public T One<T>(List<T> list)
        {
            if (list.Count == 0)
                return default(T);
            if (list.Count == 1)
                return list[0];
            throw new Exception("Expected not more than 1 element in list");
        }

        /// Makes an element or elements available as set
        static public List<T> Set<T>(T item)
        {
            var result = new List<T>();
            if (item != null)
                result.Add(item);
            return result;
        }

        /// Makes an element or elements available as set
        static public List<byte[]> Set(byte[] item)
        {
            var result = new List<byte[]>();
            if (item != null)
                result.Add(item);
            return result;
        }
        
        /// Makes an element or elements available as set
        static public List<T> Set<T>(List<T> list)
        {
            return list;
        }

        /// Makes an element or elements available as set
        static public List<T> Set<T>(T[] list)
        {
            if (list == null)
                return new List<T>();
            return Flatten(new List<T>(list));
        }

        /// Flattens nested set structures
        static public List<T> Flatten<T>(List<T[]> list)
        {
            var result = new List<T>();
            list.ForEach(i => { if (i != null) result.AddRange(i); });
            return result;
        }

        /// Flattens nested set structures
        public List<T> Flatten<T>(List<List<T>> list)
        {
            var result = new List<T>();
            list.ForEach(i => { result.AddRange(i); });
            return result;
        }

        /// Flattens nested set structures
        static public List<T> Flatten<T>(List<T> list)
        {
            while (list.Remove(default(T))) ;
            return list;
        }

}
