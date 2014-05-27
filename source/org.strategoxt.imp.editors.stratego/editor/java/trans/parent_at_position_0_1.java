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

@SuppressWarnings("all") public class parent_at_position_0_1 extends Strategy 
{ 
  public static parent_at_position_0_1 instance = new parent_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_4345)
  { 
    context.push("parent_at_position_0_1");
    Fail21485:
    { 
      IStrategoTerm term11598 = term;
      Success11529:
      { 
        Fail21486:
        { 
          IStrategoTerm s_4206 = null;
          IStrategoTerm t_4206 = null;
          t_4206 = term;
          term = e_4345;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail21486;
          s_4206 = ((IStrategoList)term).head();
          IStrategoTerm arg7695 = ((IStrategoList)term).tail();
          if(arg7695.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7695).isEmpty())
            break Fail21486;
          IStrategoTerm arg7697 = ((IStrategoList)arg7695).tail();
          if(arg7697.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7697).isEmpty())
            break Fail21486;
          term = subterm_at_0_1.instance.invoke(context, t_4206, s_4206);
          if(term == null)
            break Fail21486;
          if(true)
            break Success11529;
        }
        term = term11598;
        IStrategoTerm m_4206 = null;
        IStrategoTerm n_4206 = null;
        IStrategoTerm o_4206 = null;
        o_4206 = term;
        term = e_4345;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail21485;
        n_4206 = ((IStrategoList)term).head();
        IStrategoTerm arg7698 = ((IStrategoList)term).tail();
        m_4206 = arg7698;
        if(arg7698.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7698).isEmpty())
          break Fail21485;
        IStrategoTerm arg7700 = ((IStrategoList)arg7698).tail();
        if(arg7700.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7700).isEmpty())
          break Fail21485;
        term = subterm_at_0_1.instance.invoke(context, o_4206, n_4206);
        if(term == null)
          break Fail21485;
        term = this.invoke(context, term, m_4206);
        if(term == null)
          break Fail21485;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}