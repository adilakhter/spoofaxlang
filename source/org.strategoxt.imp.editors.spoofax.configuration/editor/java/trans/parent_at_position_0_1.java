package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parent_at_position_0_1 extends Strategy 
{ 
  public static parent_at_position_0_1 instance = new parent_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_17590)
  { 
    context.push("parent_at_position_0_1");
    Fail87701:
    { 
      IStrategoTerm term47308 = term;
      Success47285:
      { 
        Fail87702:
        { 
          IStrategoTerm u_17572 = null;
          IStrategoTerm v_17572 = null;
          v_17572 = term;
          term = h_17590;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail87702;
          u_17572 = ((IStrategoList)term).head();
          IStrategoTerm arg30006 = ((IStrategoList)term).tail();
          if(arg30006.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg30006).isEmpty())
            break Fail87702;
          IStrategoTerm arg30008 = ((IStrategoList)arg30006).tail();
          if(arg30008.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg30008).isEmpty())
            break Fail87702;
          term = subterm_at_0_1.instance.invoke(context, v_17572, u_17572);
          if(term == null)
            break Fail87702;
          if(true)
            break Success47285;
        }
        term = term47308;
        IStrategoTerm o_17572 = null;
        IStrategoTerm p_17572 = null;
        IStrategoTerm q_17572 = null;
        q_17572 = term;
        term = h_17590;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail87701;
        p_17572 = ((IStrategoList)term).head();
        IStrategoTerm arg30009 = ((IStrategoList)term).tail();
        o_17572 = arg30009;
        if(arg30009.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg30009).isEmpty())
          break Fail87701;
        IStrategoTerm arg30011 = ((IStrategoList)arg30009).tail();
        if(arg30011.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg30011).isEmpty())
          break Fail87701;
        term = subterm_at_0_1.instance.invoke(context, q_17572, p_17572);
        if(term == null)
          break Fail87701;
        term = this.invoke(context, term, o_17572);
        if(term == null)
          break Fail87701;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}