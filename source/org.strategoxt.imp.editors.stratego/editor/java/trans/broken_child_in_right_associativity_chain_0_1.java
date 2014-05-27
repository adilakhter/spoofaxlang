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

@SuppressWarnings("all") public class broken_child_in_right_associativity_chain_0_1 extends Strategy 
{ 
  public static broken_child_in_right_associativity_chain_0_1 instance = new broken_child_in_right_associativity_chain_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_4898)
  { 
    context.push("broken_child_in_right_associativity_chain_0_1");
    Fail22762:
    { 
      IStrategoTerm term12149 = term;
      Success12148:
      { 
        Fail22763:
        { 
          IStrategoTerm p_4723 = null;
          IStrategoTerm cons575 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(cons575 != o_4898 && !o_4898.match(cons575))
            break Fail22763;
          IStrategoTerm args28 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          if(args28.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args28).isEmpty())
            break Fail22763;
          IStrategoTerm arg8014 = ((IStrategoList)args28).tail();
          if(arg8014.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8014).isEmpty())
            break Fail22763;
          IStrategoTerm arg8015 = ((IStrategoList)arg8014).head();
          p_4723 = arg8015;
          IStrategoTerm cons576 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg8015});
          if(cons576 != o_4898 && !o_4898.match(cons576))
            break Fail22763;
          IStrategoTerm args29 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg8015});
          if(args29.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args29).isEmpty())
            break Fail22763;
          IStrategoTerm arg8016 = ((IStrategoList)args29).tail();
          if(arg8016.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8016).isEmpty())
            break Fail22763;
          IStrategoTerm arg8017 = ((IStrategoList)arg8016).tail();
          if(arg8017.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8017).isEmpty())
            break Fail22763;
          IStrategoTerm arg8018 = ((IStrategoList)arg8014).tail();
          if(arg8018.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8018).isEmpty())
            break Fail22763;
          term = this.invoke(context, p_4723, o_4898);
          if(term == null)
            break Fail22763;
          if(true)
            break Success12148;
        }
        term = term12149;
        IStrategoTerm k_4723 = null;
        IStrategoTerm cons577 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(cons577 != o_4898 && !o_4898.match(cons577))
          break Fail22762;
        IStrategoTerm args30 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        if(args30.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args30).isEmpty())
          break Fail22762;
        IStrategoTerm arg8019 = ((IStrategoList)args30).tail();
        if(arg8019.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8019).isEmpty())
          break Fail22762;
        IStrategoTerm arg8020 = ((IStrategoList)arg8019).head();
        IStrategoTerm cons578 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{arg8020});
        if(cons578 != o_4898 && !o_4898.match(cons578))
          break Fail22762;
        IStrategoTerm args31 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{arg8020});
        if(args31.getTermType() != IStrategoTerm.LIST || ((IStrategoList)args31).isEmpty())
          break Fail22762;
        IStrategoTerm arg8021 = ((IStrategoList)args31).tail();
        if(arg8021.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8021).isEmpty())
          break Fail22762;
        k_4723 = ((IStrategoList)arg8021).head();
        IStrategoTerm arg8022 = ((IStrategoList)arg8021).tail();
        if(arg8022.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8022).isEmpty())
          break Fail22762;
        IStrategoTerm arg8023 = ((IStrategoList)arg8019).tail();
        if(arg8023.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8023).isEmpty())
          break Fail22762;
        term = k_4723;
        IStrategoTerm term12150 = term;
        Success12149:
        { 
          Fail22764:
          { 
            term = in_selected_fragment_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22764;
            { 
              if(true)
                break Fail22762;
              if(true)
                break Success12149;
            }
          }
          term = term12150;
        }
        term = k_4723;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}