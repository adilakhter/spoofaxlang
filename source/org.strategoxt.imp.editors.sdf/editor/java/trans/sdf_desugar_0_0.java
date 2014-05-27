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

@SuppressWarnings("all") public class sdf_desugar_0_0 extends Strategy 
{ 
  public static sdf_desugar_0_0 instance = new sdf_desugar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sdf_desugar_0_0");
    Fail76096:
    { 
      IStrategoTerm v_92075 = null;
      term = termFactory.makeTuple(trans.const15582, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil11));
      term = call_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76096;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail76096;
      IStrategoTerm arg26190 = ((IStrategoList)term).tail();
      if(arg26190.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26190).isEmpty())
        break Fail76096;
      v_92075 = ((IStrategoList)arg26190).head();
      IStrategoTerm arg26191 = ((IStrategoList)arg26190).tail();
      if(arg26191.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26191).isEmpty())
        break Fail76096;
      term = v_92075;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}