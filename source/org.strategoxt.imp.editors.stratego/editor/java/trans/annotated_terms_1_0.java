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

@SuppressWarnings("all") public class annotated_terms_1_0 extends Strategy 
{ 
  public static annotated_terms_1_0 instance = new annotated_terms_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4162)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("annotated_terms_1_0");
    Fail21235:
    { 
      IStrategoTerm a_4162 = null;
      IStrategoTerm b_4162 = null;
      IStrategoTerm c_4162 = null;
      IStrategoTerm j_4162 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail21235;
      b_4162 = term.getSubterm(0);
      a_4162 = term.getSubterm(1);
      term = a_4162;
      IStrategoTerm term11411 = term;
      Success11411:
      { 
        Fail21236:
        { 
          term = e_4162.invoke(context, term);
          if(term == null)
            break Fail21236;
          if(true)
            break Success11411;
        }
        term = term11411;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
        term = e_4162.invoke(context, term);
        if(term == null)
          break Fail21235;
        term = $Hd_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21235;
      }
      c_4162 = term;
      j_4162 = term;
      term = fetch_down_1_0.instance.invoke(context, b_4162, is_string_0_0.instance);
      if(term == null)
        break Fail21235;
      term = fetch_annotated_term_0_1.instance.invoke(context, j_4162, term);
      if(term == null)
        break Fail21235;
      term = termFactory.makeTuple(term, c_4162);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}