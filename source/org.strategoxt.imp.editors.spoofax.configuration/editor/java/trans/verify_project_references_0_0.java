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
    Fail22809:
    { 
      IStrategoTerm term12161 = term;
      Success12152:
      { 
        Fail22810:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail22810;
          term = trans.constNil4;
          if(true)
            break Success12152;
        }
        term = term12161;
        IStrategoTerm i_4616 = null;
        IStrategoTerm j_4616 = null;
        IStrategoTerm m_4616 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail22809;
        i_4616 = ((IStrategoList)term).head();
        j_4616 = ((IStrategoList)term).tail();
        term = verify_project_reference_0_0.instance.invoke(context, i_4616);
        if(term == null)
          break Fail22809;
        m_4616 = term;
        term = this.invoke(context, j_4616);
        if(term == null)
          break Fail22809;
        term = termFactory.makeTuple(m_4616, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22809;
        term = flatten_list_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22809;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}