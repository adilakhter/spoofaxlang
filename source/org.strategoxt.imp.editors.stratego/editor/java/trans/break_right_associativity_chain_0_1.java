package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class break_right_associativity_chain_0_1 extends Strategy 
{ 
  public static break_right_associativity_chain_0_1 instance = new break_right_associativity_chain_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_4898)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("break_right_associativity_chain_0_1");
    Fail22759:
    { 
      IStrategoTerm term12147 = term;
      Success12146:
      { 
        Fail22760:
        { 
          IStrategoTerm a_4723 = null;
          IStrategoTerm b_4723 = null;
          IStrategoTerm e_4723 = null;
          IStrategoTerm f_4723 = null;
          IStrategoTerm cons571 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(cons571 != n_4898 && !n_4898.match(cons571))
            break Fail22760;
          IStrategoTerm args24 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(args24.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args24).isEmpty())
            break Fail22760;
          a_4723 = ((IStrategoList)args24).head();
          IStrategoTerm arg8004 = ((IStrategoList)args24).tail();
          if(arg8004.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8004).isEmpty())
            break Fail22760;
          IStrategoTerm arg8005 = ((IStrategoList)arg8004).head();
          b_4723 = arg8005;
          IStrategoTerm cons572 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg8005});
          if(cons572 != n_4898 && !n_4898.match(cons572))
            break Fail22760;
          IStrategoTerm args25 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg8005});
          if(args25.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args25).isEmpty())
            break Fail22760;
          IStrategoTerm arg8006 = ((IStrategoList)args25).tail();
          if(arg8006.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8006).isEmpty())
            break Fail22760;
          IStrategoTerm arg8007 = ((IStrategoList)arg8006).tail();
          if(arg8007.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8007).isEmpty())
            break Fail22760;
          IStrategoTerm arg8008 = ((IStrategoList)arg8004).tail();
          if(arg8008.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8008).isEmpty())
            break Fail22760;
          f_4723 = term;
          term = this.invoke(context, b_4723, n_4898);
          if(term == null)
            break Fail22760;
          e_4723 = term;
          term = f_4723;
          IStrategoTerm mkterm10;
          mkterm10 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{n_4898, (IStrategoTerm)termFactory.makeListCons(a_4723, termFactory.makeListCons(e_4723, (IStrategoList)trans.constNil4))});
          if(mkterm10 == null)
            break Fail22760;
          term = mkterm10;
          if(true)
            break Success12146;
        }
        term = term12147;
        IStrategoTerm u_4722 = null;
        IStrategoTerm v_4722 = null;
        IStrategoTerm w_4722 = null;
        IStrategoTerm x_4722 = null;
        IStrategoTerm cons573 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(cons573 != n_4898 && !n_4898.match(cons573))
          break Fail22759;
        IStrategoTerm args26 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(args26.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args26).isEmpty())
          break Fail22759;
        u_4722 = ((IStrategoList)args26).head();
        IStrategoTerm arg8009 = ((IStrategoList)args26).tail();
        if(arg8009.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8009).isEmpty())
          break Fail22759;
        IStrategoTerm arg8010 = ((IStrategoList)arg8009).head();
        IStrategoTerm cons574 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg8010});
        if(cons574 != n_4898 && !n_4898.match(cons574))
          break Fail22759;
        IStrategoTerm args27 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg8010});
        if(args27.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args27).isEmpty())
          break Fail22759;
        v_4722 = ((IStrategoList)args27).head();
        IStrategoTerm arg8011 = ((IStrategoList)args27).tail();
        if(arg8011.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8011).isEmpty())
          break Fail22759;
        w_4722 = ((IStrategoList)arg8011).head();
        IStrategoTerm arg8012 = ((IStrategoList)arg8011).tail();
        if(arg8012.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8012).isEmpty())
          break Fail22759;
        IStrategoTerm arg8013 = ((IStrategoList)arg8009).tail();
        if(arg8013.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8013).isEmpty())
          break Fail22759;
        x_4722 = term;
        term = w_4722;
        IStrategoTerm term12148 = term;
        Success12147:
        { 
          Fail22761:
          { 
            term = in_selected_fragment_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22761;
            { 
              if(true)
                break Fail22759;
              if(true)
                break Success12147;
            }
          }
          term = term12148;
        }
        term = x_4722;
        IStrategoTerm mkterm11;
        mkterm11 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{n_4898, (IStrategoTerm)termFactory.makeListCons(u_4722, termFactory.makeListCons(v_4722, (IStrategoList)trans.constNil4))});
        if(mkterm11 == null)
          break Fail22759;
        term = mkterm11;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}