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

@SuppressWarnings("all") public class collect_ast_changes_keep_parent_path_0_1 extends Strategy 
{ 
  public static collect_ast_changes_keep_parent_path_0_1 instance = new collect_ast_changes_keep_parent_path_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_4274)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_ast_changes_keep_parent_path_0_1");
    Fail25883:
    { 
      IStrategoTerm e_4274 = null;
      TermReference f_4274 = new TermReference();
      IStrategoTerm g_4274 = null;
      IStrategoTerm h_4274 = null;
      IStrategoTerm i_4274 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25883;
      e_4274 = term.getSubterm(0);
      IStrategoTerm arg6245 = term.getSubterm(1);
      if(arg6245.getTermType() != IStrategoTerm.TUPLE || arg6245.getSubtermCount() != 2)
        break Fail25883;
      g_4274 = arg6245.getSubterm(0);
      h_4274 = arg6245.getSubterm(1);
      term = get_constructor_0_0.instance.invoke(context, d_4274);
      if(term == null)
        break Fail25883;
      term = termFactory.makeTuple(term, e_4274);
      if(f_4274.value == null)
        f_4274.value = term;
      else
        if(f_4274.value != term && !f_4274.value.match(term))
          break Fail25883;
      IStrategoTerm term10308 = term;
      Success10241:
      { 
        Fail25884:
        { 
          IStrategoTerm j_4274 = null;
          j_4274 = term;
          term = length_0_0.instance.invoke(context, g_4274);
          if(term == null)
            break Fail25884;
          term = termFactory.makeTuple(term, generator.const7166);
          term = lt_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25884;
          term = length_0_0.instance.invoke(context, h_4274);
          if(term == null)
            break Fail25884;
          term = termFactory.makeTuple(term, generator.const6989);
          term = gt_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25884;
          term = j_4274;
          { 
            term = termFactory.makeTuple(g_4274, h_4274);
            term = collect_ast_changes_in_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25883;
            lifted9290 lifted92900 = new lifted9290();
            lifted92900.f_4274 = f_4274;
            term = map_1_0.instance.invoke(context, term, lifted92900);
            if(term == null)
              break Fail25883;
            i_4274 = term;
            if(true)
              break Success10241;
          }
        }
        term = term10308;
        Success10242:
        { 
          Fail25885:
          { 
            IStrategoTerm q_4274 = null;
            q_4274 = term;
            term = g_4274;
            IStrategoTerm term10312 = term;
            Success10243:
            { 
              Fail25886:
              { 
                term = is_list_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25886;
                { 
                  if(true)
                    break Fail25885;
                  if(true)
                    break Success10243;
                }
              }
              term = term10312;
            }
            term = length_0_0.instance.invoke(context, h_4274);
            if(term == null)
              break Fail25885;
            term = termFactory.makeTuple(term, generator.const6989);
            term = gt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25885;
            term = q_4274;
            { 
              if(f_4274.value == null)
                break Fail25883;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_3, new IStrategoTerm[]{f_4274.value, g_4274, h_4274}), (IStrategoList)generator.constNil7);
              i_4274 = term;
              if(true)
                break Success10242;
            }
          }
          term = termFactory.makeTuple(g_4274, h_4274);
          term = collect_ast_changes_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25883;
          i_4274 = term;
        }
      }
      term = i_4274;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}