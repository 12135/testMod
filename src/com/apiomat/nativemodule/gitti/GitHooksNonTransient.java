/*
 * Copyright (c) 2011 - 2019, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.gitti;

/**
 * Generated class for hooks on your Git data model
 */

public class GitHooksNonTransient<T extends com.apiomat.nativemodule.gitti.Git> implements com.apiomat.nativemodule.IModelHooksNonTransient<com.apiomat.nativemodule.gitti.Git>
{
	protected com.apiomat.nativemodule.gitti.Git model;

	@Override
	public void setCallingModel( final com.apiomat.nativemodule.gitti.Git model )
	{
		this.model = model;
	}


	/*
	 * Following Methods can be used if your data model is NOT set to TRANSIENT
	 */

	@Override
	public void beforePost( final com.apiomat.nativemodule.gitti.Git obj, final com.apiomat.nativemodule.Request r )
	{
	}


	@Override
	public void afterPost( final com.apiomat.nativemodule.gitti.Git obj, final com.apiomat.nativemodule.Request r )
	{
	}

	@Override
	public void beforeGet( final String id, final com.apiomat.nativemodule.Request r )
	{
	}


	@Override
	public void afterGet( final com.apiomat.nativemodule.gitti.Git obj, final com.apiomat.nativemodule.Request r )
	{
	}

	@Override
	public String beforeGetAll( final String query, final com.apiomat.nativemodule.Request r )
	{
		/* NOTE that returning null or "" would ignore any query and always return any object of this class and backend */
		return query;
	}

	@Override
	public java.util.List<com.apiomat.nativemodule.gitti.Git> afterGetAll( final java.util.List<com.apiomat.nativemodule.gitti.Git> objects, final String query, final com.apiomat.nativemodule.Request r )
	{
		/*
		 * If you want to change the returned list of elements, you have to create a new list
		 * and add the elements to return to it. Because getting elements from the "objects"
		 * list will return a copy, changing values in this list does not have any effect.
		 *
		 * If NULL is returned, unnecessary conversions are omitted and result is taken from database.
		 */
		return null;
	}
	@Override
	public boolean beforePut( final com.apiomat.nativemodule.gitti.Git objFromDB, final com.apiomat.nativemodule.gitti.Git obj, final com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public void afterPut( final com.apiomat.nativemodule.gitti.Git obj, final com.apiomat.nativemodule.Request r )
	{
		if ( obj.getGreeting( ) != null )
		{
			obj.setForeignId( "hey!" );
			obj.save( );
		}
	}

	@Override
	public boolean beforeDelete( final com.apiomat.nativemodule.gitti.Git obj, final com.apiomat.nativemodule.Request r )
	{
		return false;
	}


	@Override
	public boolean beforePostData( final com.apiomat.nativemodule.gitti.Git obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public void afterPostData( final com.apiomat.nativemodule.gitti.Git obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
	{
	}

	@Override
	public String beforeGetData( final String dataId, final String attributeName, final com.apiomat.nativemodule.TranscodingConfiguration transcodingConfig, final com.apiomat.nativemodule.Request r )
	{
		return null;
	}

	@Override
	public void afterGetData( final String dataId, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.TranscodingConfiguration transcodingConfig, final com.apiomat.nativemodule.Request r )
	{
	}

	@Override
	public boolean beforeDeleteData( final com.apiomat.nativemodule.gitti.Git obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public void afterDeleteData( final com.apiomat.nativemodule.gitti.Git obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
	{
	}

	@Override
	public boolean beforePostRef( final com.apiomat.nativemodule.gitti.Git obj, final Object referencedObject, final String referenceName, final com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public void afterPostRef( final com.apiomat.nativemodule.gitti.Git obj, final Object referencedObject, final String referenceName, final com.apiomat.nativemodule.Request r )
	{
	}

	@Override
	public String beforeGetAllReferences( final String query, final String referenceName, final com.apiomat.nativemodule.Request r )
	{
		/* NOTE that returning null or "" would ignore any query and always return any referenced object */
		return query;
	}

	@Override
	public <Z extends com.apiomat.nativemodule.AbstractClientDataModel> java.util.List<Z> afterGetAllReferences( final java.util.List<Z> objects, final String query,
		final String referenceName, final com.apiomat.nativemodule.Request r )
	{
		return null; // return objects here if you changed sth; returning null prevents unnecessary conversions
	}

	@Override
	public boolean beforeDeleteRef( final com.apiomat.nativemodule.gitti.Git obj, final Object referencedObject, final String referenceName, final com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public void afterDeleteRef( final com.apiomat.nativemodule.gitti.Git obj, final Object referencedObject, final String referenceName, final com.apiomat.nativemodule.Request r )
	{
	}

}
