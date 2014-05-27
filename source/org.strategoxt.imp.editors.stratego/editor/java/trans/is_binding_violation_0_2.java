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

@SuppressWarnings("all") public class is_binding_violation_0_2 extends Strategy 
{ 
  public static is_binding_violation_0_2 instance = new is_binding_violation_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_4739, IStrategoTerm c_4739)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail22838:
    { 
      IStrategoTerm d_4739 = null;
      IStrategoTerm e_4739 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22838;
      d_4739 = term.getSubterm(0);
      e_4739 = term.getSubterm(1);
      term = termFactory.makeTuple(d_4739, e_4739);
      IStrategoTerm term12203 = term;
      Success12169:
      { 
        Fail22839:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22839;
          if(term.getSubterm(1) != c_4739 && !c_4739.match(term.getSubterm(1)))
            break Fail22839;
          if(true)
            break Success12169;
        }
        term = term12203;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22838;
        if(term.getSubterm(0) != b_4739 && !b_4739.match(term.getSubterm(0)))
          break Fail22838;
      }
      IStrategoTerm term12204 = term;
      Success12170:
      { 
        Fail22840:
        { 
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22840;
          if(term.getSubterm(0) != b_4739 && !b_4739.match(term.getSubterm(0)))
            break Fail22840;
          if(term.getSubterm(1) != c_4739 && !c_4739.match(term.getSubterm(1)))
            break Fail22840;
          { 
            if(true)
              break Fail22838;
            if(true)
              break Success12170;
          }
        }
        term = term12204;
      }
      term = termFactory.makeTuple(d_4739, e_4739);
      if(true)
        return term;
    }
    context.push("is_binding_violation_0_2");
    context.popOnFailure();
    return null;
  }
}