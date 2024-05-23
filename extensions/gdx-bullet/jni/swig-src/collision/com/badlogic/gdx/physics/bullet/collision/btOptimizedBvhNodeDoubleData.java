/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;

public class btOptimizedBvhNodeDoubleData extends BulletBase {
	private long swigCPtr;

	protected btOptimizedBvhNodeDoubleData (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new btOptimizedBvhNodeDoubleData, normally you should not need this constructor it's intended for low-level
	 * usage. */
	public btOptimizedBvhNodeDoubleData (long cPtr, boolean cMemoryOwn) {
		this("btOptimizedBvhNodeDoubleData", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}

	public static long getCPtr (btOptimizedBvhNodeDoubleData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize () throws Throwable {
		if (!destroyed) destroy();
		super.finalize();
	}

	@Override
	protected synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btOptimizedBvhNodeDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public void setAabbMinOrg (btVector3DoubleData value) {
		CollisionJNI.btOptimizedBvhNodeDoubleData_aabbMinOrg_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAabbMinOrg () {
		long cPtr = CollisionJNI.btOptimizedBvhNodeDoubleData_aabbMinOrg_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAabbMaxOrg (btVector3DoubleData value) {
		CollisionJNI.btOptimizedBvhNodeDoubleData_aabbMaxOrg_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAabbMaxOrg () {
		long cPtr = CollisionJNI.btOptimizedBvhNodeDoubleData_aabbMaxOrg_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setEscapeIndex (int value) {
		CollisionJNI.btOptimizedBvhNodeDoubleData_escapeIndex_set(swigCPtr, this, value);
	}

	public int getEscapeIndex () {
		return CollisionJNI.btOptimizedBvhNodeDoubleData_escapeIndex_get(swigCPtr, this);
	}

	public void setSubPart (int value) {
		CollisionJNI.btOptimizedBvhNodeDoubleData_subPart_set(swigCPtr, this, value);
	}

	public int getSubPart () {
		return CollisionJNI.btOptimizedBvhNodeDoubleData_subPart_get(swigCPtr, this);
	}

	public void setTriangleIndex (int value) {
		CollisionJNI.btOptimizedBvhNodeDoubleData_triangleIndex_set(swigCPtr, this, value);
	}

	public int getTriangleIndex () {
		return CollisionJNI.btOptimizedBvhNodeDoubleData_triangleIndex_get(swigCPtr, this);
	}

	public void setPad (String value) {
		CollisionJNI.btOptimizedBvhNodeDoubleData_pad_set(swigCPtr, this, value);
	}

	public String getPad () {
		return CollisionJNI.btOptimizedBvhNodeDoubleData_pad_get(swigCPtr, this);
	}

	public btOptimizedBvhNodeDoubleData () {
		this(CollisionJNI.new_btOptimizedBvhNodeDoubleData(), true);
	}

}
