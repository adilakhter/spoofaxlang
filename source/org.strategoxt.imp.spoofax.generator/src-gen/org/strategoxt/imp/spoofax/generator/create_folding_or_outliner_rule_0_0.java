package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class create_folding_or_outliner_rule_0_0 extends Strategy 
{ 
  public static create_folding_or_outliner_rule_0_0 instance = new create_folding_or_outliner_rule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_folding_or_outliner_rule_0_0");
    Fail26159:
    { 
      IStrategoTerm n_4308 = null;
      IStrategoTerm o_4308 = null;
      o_4308 = term;
      term = heuristic_asfix_sort_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26159;
      n_4308 = term;
      term = o_4308;
      IStrategoTerm term10541 = term;
      Success10462:
      { 
        Fail26160:
        { 
          IStrategoTerm p_4308 = null;
          p_4308 = term;
          term = is_list_production_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26160;
          term = p_4308;
          { 
            Success10463:
            { 
              Fail26161:
              { 
                term = constructor_name_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26161;
                term = termFactory.makeAppl(SpoofaxGenerator._consOutlineRule_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSortAndConstructor_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consListSort_1, new IStrategoTerm[]{n_4308}), termFactory.makeAppl(SpoofaxGenerator._consConstructor_1, new IStrategoTerm[]{term})})});
                if(true)
                  break Success10463;
              }
              term = termFactory.makeAppl(SpoofaxGenerator._consOutlineRule_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consListSort_1, new IStrategoTerm[]{n_4308})});
            }
            if(true)
              break Success10462;
          }
        }
        term = term10541;
        Success10464:
        { 
          Fail26162:
          { 
            term = constructor_name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26162;
            term = termFactory.makeAppl(SpoofaxGenerator._consOutlineRule_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSortAndConstructor_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{n_4308}), termFactory.makeAppl(SpoofaxGenerator._consConstructor_1, new IStrategoTerm[]{term})})});
            if(true)
              break Success10464;
          }
          term = termFactory.makeAppl(SpoofaxGenerator._consOutlineRule_1, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consSort_1, new IStrategoTerm[]{n_4308})});
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}