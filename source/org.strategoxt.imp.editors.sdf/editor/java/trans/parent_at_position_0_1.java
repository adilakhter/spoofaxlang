package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parent_at_position_0_1 extends Strategy 
{ 
  public static parent_at_position_0_1 instance = new parent_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_92111)
  { 
    context.push("parent_at_position_0_1");
    Fail75705:
    { 
      IStrategoTerm term41466 = term;
      Success41452:
      { 
        Fail75706:
        { 
          IStrategoTerm d_92025 = null;
          IStrategoTerm e_92025 = null;
          e_92025 = term;
          term = c_92111;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail75706;
          d_92025 = ((IStrategoList)term).head();
          IStrategoTerm arg25900 = ((IStrategoList)term).tail();
          if(arg25900.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg25900).isEmpty())
            break Fail75706;
          IStrategoTerm arg25902 = ((IStrategoList)arg25900).tail();
          if(arg25902.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25902).isEmpty())
            break Fail75706;
          term = subterm_at_0_1.instance.invoke(context, e_92025, d_92025);
          if(term == null)
            break Fail75706;
          if(true)
            break Success41452;
        }
        term = term41466;
        IStrategoTerm x_92024 = null;
        IStrategoTerm y_92024 = null;
        IStrategoTerm z_92024 = null;
        z_92024 = term;
        term = c_92111;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail75705;
        y_92024 = ((IStrategoList)term).head();
        IStrategoTerm arg25903 = ((IStrategoList)term).tail();
        x_92024 = arg25903;
        if(arg25903.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg25903).isEmpty())
          break Fail75705;
        IStrategoTerm arg25905 = ((IStrategoList)arg25903).tail();
        if(arg25905.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg25905).isEmpty())
          break Fail75705;
        term = subterm_at_0_1.instance.invoke(context, z_92024, y_92024);
        if(term == null)
          break Fail75705;
        term = this.invoke(context, term, x_92024);
        if(term == null)
          break Fail75705;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}