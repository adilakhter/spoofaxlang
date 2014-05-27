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

@SuppressWarnings("all") public class declared_in_generated_file_0_1 extends Strategy 
{ 
  public static declared_in_generated_file_0_1 instance = new declared_in_generated_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_4193)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_4193 = new TermReference(ref_z_4193);
    context.push("declared_in_generated_file_0_1");
    Fail21396:
    { 
      IStrategoTerm l_4194 = null;
      IStrategoTerm h_4194 = null;
      IStrategoTerm j_4194 = null;
      IStrategoTerm k_4194 = null;
      l_4194 = term;
      IStrategoTerm term11533 = term;
      Success11478:
      { 
        Fail21397:
        { 
          term = is_editable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21397;
          { 
            if(true)
              break Fail21396;
            if(true)
              break Success11478;
          }
        }
        term = term11533;
      }
      IStrategoTerm term11534 = term;
      Success11479:
      { 
        Fail21398:
        { 
          IStrategoTerm term11535 = term;
          Success11480:
          { 
            Fail21399:
            { 
              term = import_cache_path_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21399;
              if(true)
                break Success11480;
            }
            term = get_cache_path_0_0.instance.invoke(context, term11535);
            if(term == null)
              break Fail21398;
          }
          term = $Read$From$File_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21398;
          if(true)
            break Success11479;
        }
        term = parse_file_0_0.instance.invoke(context, term11534);
        if(term == null)
          break Fail21396;
      }
      term = declare_globals_top_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21396;
      lifted6532 lifted65320 = new lifted6532();
      lifted65320.z_4193 = z_4193;
      term = oncetd_1_0.instance.invoke(context, term, lifted65320);
      if(term == null)
        break Fail21396;
      term = l_4194;
      term = base_filename_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21396;
      IStrategoTerm term11536 = term;
      Success11481:
      { 
        Fail21400:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21400;
          if(true)
            break Success11481;
        }
        term = term11536;
        IStrategoTerm term11537 = term;
        Success11482:
        { 
          Fail21401:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21401;
            if(true)
              break Success11482;
          }
          term = term11537;
          IStrategoTerm term11538 = term;
          Success11483:
          { 
            Fail21402:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21402;
              if(true)
                break Success11483;
            }
            term = term11538;
            IStrategoTerm term11539 = term;
            Success11484:
            { 
              Fail21403:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21403;
                if(true)
                  break Success11484;
              }
              term = term11539;
              IStrategoTerm d_4194 = null;
              IStrategoTerm e_4194 = null;
              IStrategoTerm g_4194 = null;
              d_4194 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21396;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail21396;
              e_4194 = ((IStrategoList)term).tail();
              g_4194 = e_4194;
              term = report_failure_0_2.instance.invoke(context, g_4194, trans.const4315, d_4194);
              if(term == null)
                break Fail21396;
            }
          }
        }
      }
      j_4194 = term;
      h_4194 = trans.const4230;
      k_4194 = j_4194;
      term = string_replace_0_2.instance.invoke(context, k_4194, h_4194, trans.const4316);
      if(term == null)
        break Fail21396;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4318, termFactory.makeListCons(term, (IStrategoList)trans.constCons2000));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21396;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}