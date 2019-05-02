// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `client.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package clientOperations;

public final class PremiumAccountPrxHelper extends Ice.ObjectPrxHelperBase implements PremiumAccountPrx
{
    private static final String __getAccessKey_name = "getAccessKey";

    public String getAccessKey()
    {
        return getAccessKey(null, false);
    }

    public String getAccessKey(java.util.Map<String, String> __ctx)
    {
        return getAccessKey(__ctx, true);
    }

    private String getAccessKey(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getAccessKey", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getAccessKey");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.getAccessKey(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getAccessKey()
    {
        return begin_getAccessKey(null, false, null);
    }

    public Ice.AsyncResult begin_getAccessKey(java.util.Map<String, String> __ctx)
    {
        return begin_getAccessKey(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getAccessKey(Ice.Callback __cb)
    {
        return begin_getAccessKey(null, false, __cb);
    }

    public Ice.AsyncResult begin_getAccessKey(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getAccessKey(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getAccessKey(Callback_Account_getAccessKey __cb)
    {
        return begin_getAccessKey(null, false, __cb);
    }

    public Ice.AsyncResult begin_getAccessKey(java.util.Map<String, String> __ctx, Callback_Account_getAccessKey __cb)
    {
        return begin_getAccessKey(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getAccessKey(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getAccessKey_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getAccessKey_name, __cb);
        try
        {
            __result.__prepare(__getAccessKey_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public String end_getAccessKey(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getAccessKey_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getAccountInfo_name = "getAccountInfo";

    public String getAccountInfo()
    {
        return getAccountInfo(null, false);
    }

    public String getAccountInfo(java.util.Map<String, String> __ctx)
    {
        return getAccountInfo(__ctx, true);
    }

    private String getAccountInfo(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getAccountInfo", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getAccountInfo");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.getAccountInfo(__ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getAccountInfo()
    {
        return begin_getAccountInfo(null, false, null);
    }

    public Ice.AsyncResult begin_getAccountInfo(java.util.Map<String, String> __ctx)
    {
        return begin_getAccountInfo(__ctx, true, null);
    }

    public Ice.AsyncResult begin_getAccountInfo(Ice.Callback __cb)
    {
        return begin_getAccountInfo(null, false, __cb);
    }

    public Ice.AsyncResult begin_getAccountInfo(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getAccountInfo(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getAccountInfo(Callback_Account_getAccountInfo __cb)
    {
        return begin_getAccountInfo(null, false, __cb);
    }

    public Ice.AsyncResult begin_getAccountInfo(java.util.Map<String, String> __ctx, Callback_Account_getAccountInfo __cb)
    {
        return begin_getAccountInfo(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getAccountInfo(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getAccountInfo_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getAccountInfo_name, __cb);
        try
        {
            __result.__prepare(__getAccountInfo_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public String end_getAccountInfo(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getAccountInfo_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            String __ret;
            __ret = __is.readString();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __isPremiumAccount_name = "isPremiumAccount";

    public boolean isPremiumAccount(String PESEL)
    {
        return isPremiumAccount(PESEL, null, false);
    }

    public boolean isPremiumAccount(String PESEL, java.util.Map<String, String> __ctx)
    {
        return isPremiumAccount(PESEL, __ctx, true);
    }

    private boolean isPremiumAccount(String PESEL, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "isPremiumAccount", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("isPremiumAccount");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.isPremiumAccount(PESEL, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_isPremiumAccount(String PESEL)
    {
        return begin_isPremiumAccount(PESEL, null, false, null);
    }

    public Ice.AsyncResult begin_isPremiumAccount(String PESEL, java.util.Map<String, String> __ctx)
    {
        return begin_isPremiumAccount(PESEL, __ctx, true, null);
    }

    public Ice.AsyncResult begin_isPremiumAccount(String PESEL, Ice.Callback __cb)
    {
        return begin_isPremiumAccount(PESEL, null, false, __cb);
    }

    public Ice.AsyncResult begin_isPremiumAccount(String PESEL, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_isPremiumAccount(PESEL, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_isPremiumAccount(String PESEL, Callback_Account_isPremiumAccount __cb)
    {
        return begin_isPremiumAccount(PESEL, null, false, __cb);
    }

    public Ice.AsyncResult begin_isPremiumAccount(String PESEL, java.util.Map<String, String> __ctx, Callback_Account_isPremiumAccount __cb)
    {
        return begin_isPremiumAccount(PESEL, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_isPremiumAccount(String PESEL, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__isPremiumAccount_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __isPremiumAccount_name, __cb);
        try
        {
            __result.__prepare(__isPremiumAccount_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(PESEL);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public boolean end_isPremiumAccount(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __isPremiumAccount_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getCreditCostInForeignCurrency_name = "getCreditCostInForeignCurrency";

    public double getCreditCostInForeignCurrency(int amount, currency curr, float period)
    {
        return getCreditCostInForeignCurrency(amount, curr, period, null, false);
    }

    public double getCreditCostInForeignCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx)
    {
        return getCreditCostInForeignCurrency(amount, curr, period, __ctx, true);
    }

    private double getCreditCostInForeignCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getCreditCostInForeignCurrency", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getCreditCostInForeignCurrency");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.getCreditCostInForeignCurrency(amount, curr, period, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period)
    {
        return begin_getCreditCostInForeignCurrency(amount, curr, period, null, false, null);
    }

    public Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx)
    {
        return begin_getCreditCostInForeignCurrency(amount, curr, period, __ctx, true, null);
    }

    public Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period, Ice.Callback __cb)
    {
        return begin_getCreditCostInForeignCurrency(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getCreditCostInForeignCurrency(amount, curr, period, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period, Callback_PremiumAccount_getCreditCostInForeignCurrency __cb)
    {
        return begin_getCreditCostInForeignCurrency(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, Callback_PremiumAccount_getCreditCostInForeignCurrency __cb)
    {
        return begin_getCreditCostInForeignCurrency(amount, curr, period, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getCreditCostInForeignCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getCreditCostInForeignCurrency_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getCreditCostInForeignCurrency_name, __cb);
        try
        {
            __result.__prepare(__getCreditCostInForeignCurrency_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(amount);
            curr.__write(__os);
            __os.writeFloat(period);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public double end_getCreditCostInForeignCurrency(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getCreditCostInForeignCurrency_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            double __ret;
            __ret = __is.readDouble();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getCreditCostInNativeCurrency_name = "getCreditCostInNativeCurrency";

    public double getCreditCostInNativeCurrency(int amount, currency curr, float period)
    {
        return getCreditCostInNativeCurrency(amount, curr, period, null, false);
    }

    public double getCreditCostInNativeCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx)
    {
        return getCreditCostInNativeCurrency(amount, curr, period, __ctx, true);
    }

    private double getCreditCostInNativeCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getCreditCostInNativeCurrency", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getCreditCostInNativeCurrency");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.getCreditCostInNativeCurrency(amount, curr, period, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period)
    {
        return begin_getCreditCostInNativeCurrency(amount, curr, period, null, false, null);
    }

    public Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx)
    {
        return begin_getCreditCostInNativeCurrency(amount, curr, period, __ctx, true, null);
    }

    public Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period, Ice.Callback __cb)
    {
        return begin_getCreditCostInNativeCurrency(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getCreditCostInNativeCurrency(amount, curr, period, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period, Callback_PremiumAccount_getCreditCostInNativeCurrency __cb)
    {
        return begin_getCreditCostInNativeCurrency(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, Callback_PremiumAccount_getCreditCostInNativeCurrency __cb)
    {
        return begin_getCreditCostInNativeCurrency(amount, curr, period, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getCreditCostInNativeCurrency(int amount, currency curr, float period, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getCreditCostInNativeCurrency_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getCreditCostInNativeCurrency_name, __cb);
        try
        {
            __result.__prepare(__getCreditCostInNativeCurrency_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(amount);
            curr.__write(__os);
            __os.writeFloat(period);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public double end_getCreditCostInNativeCurrency(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getCreditCostInNativeCurrency_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            double __ret;
            __ret = __is.readDouble();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __isClientAllowedToGetCredit_name = "isClientAllowedToGetCredit";

    public boolean isClientAllowedToGetCredit(int amount, currency curr, float period)
    {
        return isClientAllowedToGetCredit(amount, curr, period, null, false);
    }

    public boolean isClientAllowedToGetCredit(int amount, currency curr, float period, java.util.Map<String, String> __ctx)
    {
        return isClientAllowedToGetCredit(amount, curr, period, __ctx, true);
    }

    private boolean isClientAllowedToGetCredit(int amount, currency curr, float period, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "isClientAllowedToGetCredit", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("isClientAllowedToGetCredit");
                    __delBase = __getDelegate(false);
                    _PremiumAccountDel __del = (_PremiumAccountDel)__delBase;
                    return __del.isClientAllowedToGetCredit(amount, curr, period, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period)
    {
        return begin_isClientAllowedToGetCredit(amount, curr, period, null, false, null);
    }

    public Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period, java.util.Map<String, String> __ctx)
    {
        return begin_isClientAllowedToGetCredit(amount, curr, period, __ctx, true, null);
    }

    public Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period, Ice.Callback __cb)
    {
        return begin_isClientAllowedToGetCredit(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_isClientAllowedToGetCredit(amount, curr, period, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period, Callback_PremiumAccount_isClientAllowedToGetCredit __cb)
    {
        return begin_isClientAllowedToGetCredit(amount, curr, period, null, false, __cb);
    }

    public Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period, java.util.Map<String, String> __ctx, Callback_PremiumAccount_isClientAllowedToGetCredit __cb)
    {
        return begin_isClientAllowedToGetCredit(amount, curr, period, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_isClientAllowedToGetCredit(int amount, currency curr, float period, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__isClientAllowedToGetCredit_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __isClientAllowedToGetCredit_name, __cb);
        try
        {
            __result.__prepare(__isClientAllowedToGetCredit_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(amount);
            curr.__write(__os);
            __os.writeFloat(period);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public boolean end_isClientAllowedToGetCredit(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __isClientAllowedToGetCredit_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PremiumAccountPrx)
            {
                __d = (PremiumAccountPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PremiumAccountPrx)
            {
                __d = (PremiumAccountPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PremiumAccountPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PremiumAccountPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PremiumAccountPrx)
            {
                __d = (PremiumAccountPrx)__obj;
            }
            else
            {
                PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PremiumAccountPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PremiumAccountPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PremiumAccountPrxHelper __h = new PremiumAccountPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::clientOperations::Account",
        "::clientOperations::PremiumAccount"
    };

    public static String ice_staticId()
    {
        return __ids[2];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _PremiumAccountDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _PremiumAccountDelD();
    }

    public static void __write(IceInternal.BasicStream __os, PremiumAccountPrx v)
    {
        __os.writeProxy(v);
    }

    public static PremiumAccountPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PremiumAccountPrxHelper result = new PremiumAccountPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}