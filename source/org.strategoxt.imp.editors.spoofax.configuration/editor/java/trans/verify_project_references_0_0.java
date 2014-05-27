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

@SuppressWarnings("all") public class verify_project_references_0_0 extends Strategy 
{ 
  public static verify_project_references_0_0 instance = new verify_project_references_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("verify_project_references_0_0");
    Fail87617:
    { 
      IStrategoTerm term47248 = term;
      Success47239:
      { 
        Fail87618:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail87618;
          term = trans.constNil14;
          if(true)
            break Success47239;
        }
        term = term47248;
        IStrategoTerm f_17560 = null;
        IStrategoTerm g_17560 = null;
        IStrategoTerm j_17560 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail87617;
        f_17560 = ((IStrategoList)term).head();
        g_17560 = ((IStrategoList)term).tail();
        term = verify_project_reference_0_0.instance.invoke(context, f_17560);
        if(term == null)
          break Fail87617;
        j_17560 = term;
        term = this.invoke(context, g_17560);
        if(term == null)
          break Fail87617;
        term = termFactory.makeTuple(j_17560, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87617;
        term = flatten_list_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail87617;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}